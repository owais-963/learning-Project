import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class LogicWithArray {
    public static void arraing() {
        String[] names={"Owais","Uzair","Usaid","Humaid"};
        String one = names[0];
        System.out.println(one.length());
        String[][] Names={{"Owais","Uzair","Usaid","Humaid"},
                {"Ali","Ali","Ullaha", "Ullaha"}};
        System.out.println(Arrays.stream(Names).count());
        for (int i=0; i<Names.length;i++){
            for (int j=0; j < Names[i].length; j++){
                System.out.println(Names[i][j]);
            }

        }

        Scanner input=new Scanner(System.in);
        String name=input.next();
        //int index
        //for(int l=0; l < names.length; l++){
        //}

        }
       // System.out.println(one[0]);
        //for (int i=0; i < one.length; i++){
          //  System.out.println(one[i]);

        //}
        public static void main(String[] args) {
            arraing();
        }

    }
