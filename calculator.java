import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {
        boolean statement=true;
        while (statement){
            try {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Enter the first no: ");
                double no1 = input1.nextDouble();
                Scanner input2 = new Scanner(System.in);
                System.out.println("Chose an operator: /, *, +, - : ");
                char operator=input2.next().charAt(0);

                //System.out.println(operator);
                Scanner input3 = new Scanner(System.in);
                System.out.println("Enter the second number: ");
                double no2 = input3.nextDouble();
                if(operator=='/') {
                    double ans = (double) no1 / no2;
                    System.out.println(ans);
                    statement=false;
                }
                else if (operator=='*'){
                    double ans=(double) no1*no2;
                    System.out.println(ans);
                    statement=false;
                }
                else if (operator=='+'){
                    double ans=(double) no1+no2;
                    System.out.println(ans);
                    statement=false;
                }
                else if (operator=='-'){
                    double ans=(double) no1-no2;
                    System.out.println(ans);
                    statement=false;
                }
                //else if (operator=='^'){
                   // double ans=
                //}
                else {
                    System.out.println("please chose a correct operator");
                    //statement=true;
                }

            }catch (Exception e){
                System.out.println("Exception caught please try again");

            }

        }

    }

}
