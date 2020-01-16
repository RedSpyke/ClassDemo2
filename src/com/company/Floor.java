package com.company;

public class Floor {

    private double width;
    private double height;
    public Floor(double width, double height) {
        setHeight(height);
        setWidth(width);
    }
    public void setWidth(double width) {
        if (width < 0 ){
            this.width = 0.0;
        }
        else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height <0){
            this.height = 0.0;
        }
        else {
            this.height = height;
        }

    }
    public double getArea(){
        return height*width;
    }
}
