package ru.mirea.lab3;

public abstract class Shape {
    final double PI = 3.1428;
    protected String color;
    protected boolean filled;

    public Shape(){
    }

    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public String toString(){
        return "This shape is " + getColor() + " and is " + isFilled();
    }
}