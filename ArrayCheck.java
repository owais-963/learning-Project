import java.io.File;
import java.util.*;

public class ArrayCheck {
    private String name;
    private int roll_no;
    private String level;
    private int per;

    ArrayCheck (String name,int roll_no,String level,int per){
        this.name=name;
        this.level=level;
        this.roll_no=roll_no;
        this.per=per;
    }

    public int getPer() {
        return per;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
class Check{
    public static void main(String[] args) {
        ArrayCheck arrayCheck=new ArrayCheck("Owais",19,"six",80);

        System.out.println(arrayCheck.getLevel());

        ArrayCheck[] s={arrayCheck};
        System.out.println(s);
        System.out.println(s.getClass());

        System.load("owais");

    }
}

class CropPaperSeasor{
    public static void main(String[] args) {
        int sysPoint=0;
        int userPoint=0;
        String syMove = null;
        Scanner scanner=new Scanner(System.in);
        String userMove=scanner.next().toLowerCase(Locale.ROOT);
        System.out.println(userMove);
        int n = new Random().nextInt(3);
        switch (n) {
            case 0 -> syMove = "Rock";
            case 1 -> syMove = "Paper";
            case 2 -> syMove = "Scissor";
        }
        System.out.println(syMove);
        if (syMove.equals(userMove)){
            sysPoint=userPoint;
        }
        else if (n==0&&userMove.equals("paper")){
            userPoint++;
        }else if (n==0&&userMove.equals("scissor")){
            sysPoint++;
        }else if (n==1&&userMove.equals("rock")){
            sysPoint++;
        }else if (n==1&&userMove.equals("scissor")){
            userPoint++;
        }else if (n==2&&userMove.equals("rock")){
            userPoint++;
        }else if (n==2&&userMove.equals("paper")){
            sysPoint++;
        }

        System.out.println("User Point = "+userPoint +"\n"+ "System Point = "+sysPoint);

        if (userPoint>sysPoint){
            System.out.println("You Win");
        }else if (sysPoint>userPoint){
            System.out.println("You Lose");
        }else {
            System.out.println("Match Draw");
        }
    }
}
class PrintStarInPartern{
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class Factorial{
    public static double factorial(double n){
        double i=1;
        double factorIal=1;
        while (i<=n){
            factorIal *=i;
            i++;
        }
        return factorIal;
    }

    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }
}
class Array{
    public static void main(String[] args) {
        int[] marks= new int[5];
        marks[0]=10;
        marks[1]=20;
        marks[3]=10;

        //We can Use Static Methode Out Side the Class
        double factorial=Factorial.factorial(100);
        System.out.println(factorial);
//
//

//        for (int i=0;i<marks.length;i++){
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Enter A Number");
//            int n=scanner.nextInt();
//            marks[i]=n;
//
//        }
//
//        System.out.println("\n");
//
//        for (int i:marks){
//            System.out.println(i);
//            }
//
/*
        int[][][] multiIntArr={{{0,1},{1,0}},{{1,1}}};
        System.out.println(multiIntArr[1][0][1]);

        for (int e:marks){
            if (e==20){
                System.out.println("20 Is present");
            }else {
                System.out.println("20 Is not present");
            }

        }

        //Reversing an Array
*/
        int[]arr={1,2,3,45,67,89,544,10,-865,4,5};
        int l=arr.length;
        int m=Math.floorDiv(l,2);  //  m = Mid Point
//        int firstHalf;
//        for (int i=0;i<m;i++){
//            //first half element=arr[i]
//            //second half element=arr[l-1-i]
//            firstHalf=arr[i];
//            //Change first Half Value With 2nd half
//            arr[i]=arr[l-1-i];
//            //Now Changing 2nd half wih fist half
//            arr[l-i-1]=firstHalf;
//        }
//
//        for (int e:arr){
//            System.out.println(e);
//        }

        int min=Integer.MAX_VALUE;
        for (int e:arr){
            if (e<min){
                min=e;
            }
        }

        System.out.println(min);


    }


}

class Methodes{
    static void change(int x){
        x=0;
    }
    static void change(int[] arr){
        arr[0]=4;
    }

    //Methode Over Loading
    static void change(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }
    //This Methode is cause to error because we can't over loaded the with change of dATA TYPE
    //we have to change no of parameter or type of parameter to overloading
//    static int change(int x){
//        int y=x+x;
//        return y;
//    }

    static int change(){
        int x=2+3;
        return x;
    }

    // pasing multiple arguments in java methode

    static void sum(int ...arr){
        int r=0;
        for (int e:arr){
            r+=e;
        }
        System.out.println(r);
    }

    //Recursion

    static int factorial(int n){
        if (n==0||n==1){
            return n;
        }
        else {
            return n*factorial(n-1);
        }
        /*

        EXPLANATION OF FUNCTION
              suppose n=3
              factorial(3)
              if block is false for f(3)
              else block{
                3*factorial(3-1)
                3*factorial(2)
                again if block is false
                else block{
                    3*2*factorial(2-1)
                    3*2*factorial(1)
                    Now if block is true then
                    3*2*1=6
                }
              }

              //CHECK MANUALLY
                n!=1*2*...*(n-1)*n
                for n=3
                3!=1*2*3
                3!=6 as same as our function answer


         */

    }
    static int fib(int n){
        if (n==1||n==2){
            return n-1;
        }else {
            return fib(n-1)+fib(n-2);
        }
        /*

        FUNCTION EXPLANATION{
           fro example n=5
           fib(n)=fib(5)
           so the if condition is false and it goes for else condition
           in else condition{
                fib(5-1)+fib(5-2)
                fib(4)+fib(3)
                if condition is again false and it goes for else
                then again in else
                {
                    fib(4-1)+fib(4-2)+fib(3-1)+fib(3-2)
                    fib(3)+fib(2)+fib(2)+fib(1)
                    The Condition is true for all except first
                    so first goes to else while remaining return 1 and 0
                    fib(3-1)+fib(3-2)+1+1+0
                    fib(2)+fib(1)+2
                    Now the all condition is true for if so,
                    1+0+2
                    =3

                    so the fib(5)=3

                    //CHECK THE ANSWER MANUALLY
                        fib is the series of no in which the first two no is 0 and 1
                        while the other is sum of last two num
                        E.G 0,1,1,2,3,5,8,...,n
                        so acc to rule fib of 5 is: 3 as same as our function



                }
           }

        }

         */
    }

    static void pertern(int n){
        if (n > 0) {
            for (int i = n; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            pertern(n-1);

        }
        if (n > 0) {
            pertern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a = 92;
        change(a);
        System.out.println(a);

        int[] arr={1,2,3,4,5,5,6,7,67};
        change(arr);
        System.out.println(arr[0]);
        change(3,1);
        System.out.println(change());
        sum(343434566,6565,6567,7,67,5656,54);

        System.out.println(factorial(5));
        int fib=fib(5);
        System.out.println(fib);
        pertern(4);
    }
}

