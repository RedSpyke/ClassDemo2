package com.company;

public class Point {

    private int x;
    private int y;

    public Point() {
    }
    public Point( int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance between points

    public double distance (){
        return Math.sqrt((x*this.x) + (y*this.y));
    }
    public double distance (int i , int j){
        return Math.sqrt((x-i)*(x-i) + (y-j)*(y-j));
    }
    public double distance (Point another){
        return Math.sqrt((another.x - this.x) * (another.x - this.x) + (another.y - this.y)* (another.y - this.y));
    }


}
