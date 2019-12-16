package com.javarush.task.task05.task0519;

/* 
Ходим по кругу
*/

public class Circle {
      int centerX, centerY, radius, width, color;

      public Circle(int x, int y, int r){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
      }
    public Circle(int x, int y, int r, int w){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
    }
    public Circle(int x, int y, int r, int w, int c){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
        this.color = c;
    }

    public static void main(String[] args) {

    }
}
