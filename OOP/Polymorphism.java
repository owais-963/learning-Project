package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Bicycle bicycle= new MountainCycle(32,2);
        bicycle.speedUp(3);
        bicycle.applyBreak(2);
    }
}

/*

in polymorphism we create an object of a class which contain
multiple interfaces with reference of only one Interface from them
we use this technique when we need to use the methods only one interface.


 */
