package com.company;

public class Car {

    private String colourCar;
    private String typeCar;
    private String brandCar;
    private int doorsCar;

    private boolean driving = false;
    public void isDriving (){
        driving = true;
    }
    public void isNotDriving (){
        driving = false;
    }

    public void informationCar (){
        System.out.println("Car is driving. "+ driving);
    }

    public void setColourCar (String colourCar){
        this.colourCar = colourCar;
    }

    public String getColourCar (){
        return this.colourCar;
    }





}
