package OOP;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        String Name;
        String name="owais";
        Scanner input=new Scanner(System.in);
        Name=input.nextLine();
        System.out.println(Name);
        if (Name.equals(name)){
            System.out.println("it's work");
        }else {
            System.out.println("why it not work");
        }

    }
}
