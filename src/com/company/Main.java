package com.company;


public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.0, 3.0);
        //one.add(1,1);
       // System.out.println("one real " + one.getReal());
        //System.out.println("one imaginary " + one.getImaginary());

        //one.subtract(3, 5);
        //System.out.println("one real " + one.getReal());
       // System.out.println("one imaginary " + one.getImaginary());

        one.add(two);
        System.out.println("one real " + one.getReal());
        System.out.println("one imaginary " + one.getImaginary());

    }


}


