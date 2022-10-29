import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Chose Number b/w 1 to 10");
        Scanner input=new Scanner(System.in);
        int Num=input.nextInt();
        if (Num<5) {
            System.out.println("Number is less than 5");
        }if (Num==5){
            System.out.println("Number is 5");
            Num=4;
            System.out.println("Now number is "+Num);
        }if(Num>5 && Num<10){
            System.out.println("Number is greater than 5");
        }if (Num>10){
            System.out.println("Chutye k bache 1 10 tk ka kha hai");

        }
        System.out.println(Num);

        }


    }
