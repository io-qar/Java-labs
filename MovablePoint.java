package ru.mirea.lab3;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "The point set to ( " + x + ", " + y + " ) and has speed (" + xSpeed + ", " + ySpeed + " )";
    }

    @Override
    public void moveUp(){
        this.y = y + ySpeed;
    }

    @Override
    public void moveDown(){
        this.y = y - ySpeed;
    }

    @Override
    public void moveLeft(){
        this.x = x - xSpeed;
    }

    @Override
    public void moveRight(){
        this.x = x + xSpeed;
    }
}