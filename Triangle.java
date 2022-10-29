public class Triangle {

    static int no_of_side=3;

    double base;
    double height;
    double SideLaneOne;
    double SideLaneTwo;
    double SideLaneThree;

    static double calculator(double value1, double value2){
        return value1+value2;

    }

    public Triangle(double base,double height,double SideLaneOne,
                    double SideLaneTwo,double SideLaneThree){
        this.base=base;
        this.height=height;
        this.SideLaneOne=SideLaneOne;
        this.SideLaneTwo=SideLaneTwo;
        this.SideLaneThree=SideLaneThree;

    }
    public double findArea(double length,double Height){
        return (length*Height);
    }
}
