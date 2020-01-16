package com.company;


public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(4);
        Floor floor = new Floor(10, 5);
        Calculator calculator = new Calculator(floor , carpet);
        System.out.println("Total = "+ calculator.getTotalCost());


    }


}


