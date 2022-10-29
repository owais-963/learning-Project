package OOP;


import java.lang.reflect.Array;

interface Bicycle{

    /*
        Interface is a set of abstract method.

        -Difference B/W Abstract class And Interface:
            1.
                - If a class has one abstract method so the whole
                  class is called abstract class.
                - In interface all method are abstract
            2.
                - We can't create a child class with multiple
                  abstract class.
                - We can create a class with multiple interface

        -We can create a property of interface
        -Property of Interface is is final we can't change it
     */

    int a=34;

    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface AdvanceBicycle {
    void changeGear(int gear);
}


class MountainCycle implements Bicycle,AdvanceBicycle{

    int speed;
    int gear;

    public MountainCycle(int speed,int gear) {
        this.speed = speed;
        this.gear=gear;
    }

    @Override
    public void applyBreak(int decrement) {

        System.out.println("Applying Break");
        this.speed=this.speed-decrement;
        System.out.println("speed = "+(this.speed));

    }

    @Override
    public void speedUp(int increment) {

        System.out.println("Speeding up your cycle");
        this.speed=this.speed+increment;
        System.out.println("speed = "+(this.speed));

    }

    @Override
    public void changeGear(int change) {
        System.out.println("gear = "+change);
    }
}


public class Interface_practice {
    public static void main(String[] args) {
        Bicycle bicycle=new MountainCycle(20,2);
        bicycle.applyBreak(5);
        bicycle.speedUp(10);
    }

}

