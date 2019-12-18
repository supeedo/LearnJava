package com.javarush.games.snake;

import java.util.ArrayList;
import java.util.List;

import com.javarush.engine.cell.*;

public class Snake extends GameObject {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public Snake( int x, int y ) {
        super(x, y);
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void draw( Game game ) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                if (isAlive == true) {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
                } else
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, Color.RED, 75);
            }
            if (i > 0) {
                if (isAlive == true) {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
                } else
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED, 75);
            }
        }
    }

    public void setDirection( Direction direction ) {
        if (this.direction == Direction.LEFT && direction == Direction.RIGHT | snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        }
        if (this.direction == Direction.RIGHT && direction == Direction.LEFT | snakeParts.get(0).x == snakeParts.get(1).x) {
            return;
        }
        if (this.direction == Direction.UP && direction == Direction.DOWN | snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        }
        if (this.direction == Direction.DOWN && direction == Direction.UP | snakeParts.get(0).y == snakeParts.get(1).y) {
            return;
        } else {
            this.direction = direction;
        }
    }

    public void move( Apple apple ) {
        GameObject snakeHead = createNewHead();
        if (checkCollision(snakeHead)) {
            isAlive = false;
        } else if (snakeHead.x < 0 || snakeHead.x >= SnakeGame.WIDTH || snakeHead.y < 0 || snakeHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
        } else if (snakeHead.x == apple.x && snakeHead.y == apple.y) {
            apple.isAlive = false;
            snakeParts.add(0, snakeHead);
        } else {
            snakeParts.add(0, snakeHead);
            removeTail();
        }

    }

    public GameObject createNewHead() {
        if (direction == Direction.LEFT) {
            return new GameObject(x - 1, y);
        }
        if (direction == Direction.RIGHT) {
            return new GameObject(x + 1, y);
        }
        if (direction == Direction.UP) {
            return new GameObject(x, y - 1);
        }
        if (direction == Direction.DOWN) {
            return new GameObject(x, y + 1);
        }
        return null;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision( GameObject gameObject ) {
        for (GameObject go : snakeParts) {
            if (go.x == gameObject.x && go.y == gameObject.y) {
                return true;
            }
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
