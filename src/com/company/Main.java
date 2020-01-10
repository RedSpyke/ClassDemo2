package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

       /*
        Car Tesla = new Car();

        Tesla.informationCar();

        Tesla.isDriving();
        Tesla.informationCar();

        Tesla.isNotDriving();
        Tesla.informationCar();
        Tesla.setColourCar("Black");
        System.out.println("Colour of the car is " + Tesla.getColourCar());

        */
/*
       SimpleCalculator calculator = new SimpleCalculator();

       calculator.setFirstNumber(5);
       calculator.setSecondNumber(4);
        System.out.println("add = "+ calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());
        System.out.println("multiplication = " + calculator.getMultiplicationResult());
        System.out.println("division = " + calculator.getDivisionResult());

 */
bankAccount bankAccount1 = new bankAccount(12345, 0.0 , "Jeo", "geo.bob@gmail.com", "07345864");
bankAccount1.setBalance(1000);
System.out.println(bankAccount1.getBalance());
bankAccount1.depositFunds(300);
System.out.println(bankAccount1.getBalance());
bankAccount1.withdrawFunds(1300);
System.out.println(bankAccount1.getBalance());
bankAccount1.displayAccountInfo();


}
}