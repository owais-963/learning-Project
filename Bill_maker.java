import javax.management.ValueExp;
import javax.swing.*;
import java.util.Scanner;

public class Bill_maker {
    public static double tip_calculator(double meal_price){  //if we want to use return key word
                                                             //we have to use  double instead of void
        double tip=0;
        double tax=0;
        double total=0;
        if (meal_price >= 100 & meal_price < 500){
           tip=meal_price/100*8;
           tax=meal_price/100*.225;
           total=meal_price+tip+tax;
        }else if (meal_price>=500 & meal_price<1500){
            tip=meal_price/100*4.25;
            tax=meal_price/100*0.35;
            total=meal_price+tip+tax;
        } else if (meal_price>=1500 & meal_price<3000){
            tip=meal_price/100*3;
            tax=meal_price/100*.45;
            total=tip+tax+meal_price;
        } else if (meal_price>=3000& meal_price<10000){
            tip=meal_price/100*2;
            tax=meal_price/100*0.575;
            total=tip+tax+meal_price;

        }else if(meal_price>=10000){
            tip=meal_price/100*2.17;
            tax=meal_price/100*0.7;
            total=meal_price+tip+tax;
        }
        /* String m_price="Meal Price: "+meal_price+" Rs";
        String Tip="Tip: "+tip +" Rs";
        String Tax="tax: "+tax + " Rs";
        String Total="Total Amount: "+total+" Rs";
        System.out.printf(" %s \n %s \n %s \n %s ",m_price,Tip,Tax,Total);

         */
        return total; //we can return only one value from function

            }

    public static void main(String[] args) {
       boolean Flag=true;
       while (Flag) {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the meal price: ");
           try {
               double meal_price = input.nextDouble();
               if (meal_price < 100) {
                   System.out.println("Price could not be less then 100");
               }else {
                   tip_calculator(meal_price);
                   Flag = false;
               }
           }
           catch (Exception E){
               System.out.println("Error caught");
               Flag=true;
           }


       }
    }
        }
