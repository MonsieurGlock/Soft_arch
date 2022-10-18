// package com.solid.lsp;

public class Square implements Geometric {

    private int width;
    private int height;
    Square(int side) {
        this.setSide(side);
    }

  
    public void setWidth(int width) {
        this.setSide(width);
    }

    public void setHeight(int height) {
        this.setSide(height);
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }

    public int getArea() {
        return this.width * this.height;
    }
}
