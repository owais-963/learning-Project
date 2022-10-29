package OOP;

abstract class Base{

    /*
        Abstract class is a class which have at least one abstract methode
        in abstract method we just define the structure of method or define
        a method but can not write any single line of code inside the method in
        other words we just define a method but can' add an function in it
        we write an abstract method like this:
            {
                abstract public void rightExample();
            }

        if we put any function or write any single line of code a the time of
        implementation of method we except an error as a reward for example:
            {

                abstract public void wrongExample(){
                    System.out.println("I am wrong example,
                                         if you use me I throw
                                         an error.")

                }

            }
     */

    public Base() {
        System.out.println("This is a constructor of Base class" );
    }
    public void main(){
        System.out.println("this is main methode");
    }

    abstract public void method();
    abstract public void method1();

}
class Child extends Base{
    int a;
    int b;

    public Child(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /*
        If we create a child of an abstract class so we have to override the abstract methode
        if we defined any abstract method in parent class
     */

    @Override
    public void method() {
        int c=a+b;
        System.out.println(c);
    }

    @Override
    public void method1() {

        int c=a-b;
        System.out.println(c);

    }
}

abstract class Child1 extends Base{

    /*
        In children class of abstract parent class if
        we don't override the all abstract method which we define in parent class
        so we except an error and in order to remove the error we have to make the
        children class abstract also.
     */
    public Child1() {
        System.out.println("this is abstract child class of abstract parent class");
    }
    abstract public void method3();
}
class Child2 extends Child1{

    /*

        If we create a child class of a abstract child class of an abstract parent class
        so we have to override the all abstract method of all parent classes.

     */



    @Override
    public void method3() {

    }

    @Override
    public void method() {

    }

    @Override
    public void method1() {

    }
}



public class AbstractMethod {
    public static void main(String[] args) {

        /*
            we can create the object of abstract class as usual object
            of those child class which is not an abstract class it self.
         */

        Child child=new Child(4,5);
        child.main(); //paren class method
        child.method(); //parent class abstract method override in child class
        child.method1(); //parent class abstract method override in child class

        /*
            If we create an object of child of an abstract class
            or an abstract class it self  so we have to
            override the all abstract methode which define in
            class or in parent class.
         */

        Base base=new Base() {
            @Override
            public void method() {
                System.out.println("Hello");
            }

            @Override
            public void method1() {

            }
        };

        Child1 child1=new Child1() {
            @Override
            public void method3() {

            }

            @Override
            public void method() {

            }

            @Override
            public void method1() {

            }
        };



        Child2 child2=new Child2();
        child2.main();
        child2.method();
        child2.method1();
        child2.method3();

    }
}
