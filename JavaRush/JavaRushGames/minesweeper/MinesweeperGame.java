package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 12;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private int countClosedTiles = SIDE * SIDE;
    private final static String MINE = "\uD83D\uDCA3";
    private final static String FLAG = "\uD83D\uDEA9";
    private boolean isGameStopped;
    private int score;


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();

    }

    private void createGame() {

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellValue(i, j, "");
            }
        }

        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;

                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.GRAY);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;

    }

    private List<GameObject> getNeighbors( GameObject gameObject ) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                int count = 0;
                if (!gameField[y][x].isMine) {
                    List<GameObject> list = getNeighbors(gameField[y][x]);
                    for (GameObject go : list) {
                        if (go.isMine) {
                            count++;
                        }
                    }
                    gameField[y][x].countMineNeighbors = count;
                }
            }
        }
    }

    private void openTile( int x, int y ) {
        if (gameField[y][x].isFlag || isGameStopped == true || gameField[y][x].isOpen) {
            return;
        }
        if (gameField[y][x].isMine) {
            gameField[y][x].isOpen = true;
            setCellValueEx(x, y, Color.RED, MINE);
            gameOver();
        } else {
            gameField[y][x].isOpen = true;
            score += 5;
            setScore(score);
            setCellColor(x, y, Color.WHITE);
            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            if (gameField[y][x].countMineNeighbors == 0) {
                setCellValue(x, y, "");
                List<GameObject> list = getNeighbors(gameField[y][x]);
                for (GameObject go : list) {
                    if (!go.isOpen) {
                        openTile(go.x, go.y);
                    }
                }
            }
            countClosedTiles--;
            if (countClosedTiles == countMinesOnField) {
                win();
            }
        }
    }


    public void onMouseLeftClick( int x, int y ) {
        if (isGameStopped == true) {
            restart();
        }
        else {
            openTile(x, y);
        }
    }

    public void onMouseRightClick( int x, int y ) {
        markTile(x, y);
    }

    private void markTile( int x, int y ) {
        if (isGameStopped == true || gameField[y][x].isOpen || countFlags == 0 && !gameField[y][x].isFlag) {
            return;
        }
        if (!gameField[y][x].isFlag && !gameField[y][x].isOpen) {
            gameField[y][x].isFlag = true;
            setCellValue(x, y, FLAG);
            countFlags--;
            setCellColor(x, y, Color.YELLOW);
        } else if (gameField[y][x].isFlag) {
            gameField[y][x].isFlag = false;
            setCellValue(x, y, "");
            countFlags++;
            setCellColor(x, y, Color.GRAY);
        }
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Игра окончена!", Color.ALICEBLUE, 40);
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "ПОБЕДА!", Color.ALICEBLUE, 40);
    }

    private void restart() {
        countClosedTiles = SIDE * SIDE;
        score = 0;
        setScore(0);
        countMinesOnField = 0;
        createGame();
        isGameStopped = false;
    }
}