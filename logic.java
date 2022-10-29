import java.util.Scanner;
public class logic {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
       for (int a = 0; a<number+1 ; a++){
           System.out.println(a);
       }
       int i=0;
       while (i!=number){
           System.out.println(i);
           i++;

       }
        //for (int i = 0; i <= 10; i = i + 2) {
          //  System.out.println(i);
       // }
    }
}