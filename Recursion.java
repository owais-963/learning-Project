import java.util.Arrays;
public class Recursion {
    static int recursion(int k) {
        if (k > 0) {
            return (k + recursion(k - 1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int num1=1;
        int num2=2;
        int num3=3;

        int[] arr={num1,num2,num3};
        for (int  i:arr){
            System.out.println(i);
        }

    }
}
