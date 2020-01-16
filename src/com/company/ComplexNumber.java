package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal (){
        return real;
    }
    public double getImaginary (){
        return imaginary;
    }

    public void add (double realX, double imaginaryY){
        real += realX;
        imaginary += imaginaryY;
    }

    public void add (ComplexNumber another) {
        real += another.real;
       imaginary += another.imaginary;
    }

    public void subtract (double realX, double imaginaryY){
        real -= realX;
        imaginary -= imaginaryY;
    }
    public void subtract (ComplexNumber another) {
        real -= another.real;
        imaginary -= another.imaginary;
    }


}
