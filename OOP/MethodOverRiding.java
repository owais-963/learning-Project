package OOP;


class One{
    int a;

    public One(int a) {
        this.a = a;
    }
    public void method(){
        System.out.println("this methode goes to override");
    }

    public int getA(){
        return a;
    }
}
class Two extends One{
    int b;
    public Two(int a) {
        super(a);
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB(){
        return b;
    }

    @Override
    public void method(){
        System.out.println("This is an Override Methode");
    }

    /*

        Methode Overriding is a technic by which we can override a method
        of parent class in child class in method overriding the basic structure
        of a methode is same while we can change the inner body of function,
        in overriding the name of the method data type of method and the
        the parameters is same as the methode of parent class while we can change
        the inner body or function of methode.

     */

}

public class MethodOverRiding {
    public static void main(String[] args) {
        One one=new One(4); //Parent Class
        one.method();

        Two two=new Two(3); //Child class of class One
        two.method();

        System.out.println();

        //DYNAMIC METHOD DISPATCH

        /*

            Dynamic Method Dispatch is a technic in which we create the object
            of child class with reference of parent class e.g
            {
                Parent obj= new Child();
                }
            but we can call the methode from parent class only but when we call
            the override methode so it call the methode from child class it happens
            only with override methode.

         */

        One obj= new Two(4);
        /*

            obj.b=34; --> it throws an error because this object is refer by class one
            and class one doesn't hold attribute b.

            obj.getB(); --> it also throw error cause of above reason.

         */

        System.out.println("DYNAMIC METHOD DISPATCH");
        obj.method();// it runs the override method of child class

        System.out.println(obj.getA());

    }


}
