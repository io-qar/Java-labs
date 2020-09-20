package ru.mirea.lab3;

public class Square extends Rectangle{
    public Square(){
        width = 1;
        length = 1;
        color = "RED";
        filled = false;
    }

    public Square(double side){
        width = side;
        length = side;
    }

    public Square(double side, String c, boolean f){
        width = side;
        length = side;
        color = c;
        filled = f;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double width){
        this.width = width;
    }

    @Override
    public void setWidth(double side){
        this.width = side;
    }

    @Override
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString(){
        return "This square has " + length + "side, and it's " + color;
    }
}