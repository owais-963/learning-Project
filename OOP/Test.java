package OOP;
import java.util.Locale;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        System.out.print("Enter your first name: ");
        Scanner inputfn = new Scanner(System.in);
        String fname = inputfn.next();
        System.out.print("Enter your last name: ");
        Scanner inputln = new Scanner(System.in);
        String lname = inputln.next();
        System.out.print("Enter your Age: ");
        Scanner inputage = new Scanner(System.in);
        String age = inputage.next();
        System.out.print("Enter your Email: ");
        Scanner inputemail = new Scanner(System.in);
        String email = inputemail.next();
        System.out.print("Enter your phone number: ");
        Scanner inputphno = new Scanner(System.in);
        String phone_no = inputphno.next();
        UserProfile model1 = new UserProfile(fname, lname, age, email, phone_no);
        System.out.print("you want to save your data (yes/no): ");
        Scanner inputoption = new Scanner(System.in);
        String option = inputoption.next();
        option = option.toLowerCase(Locale.ROOT);
        if (option.equals("yes")) {
            System.out.print("Enter your password: ");
            Scanner inputpass = new Scanner(System.in);
            String pass = inputpass.next();
            model1.user_info(pass);
            System.out.print("Type 'Show' to see to your data or 'Exit' to to quite the program: ");
            Scanner inputchoice = new Scanner(System.in);
            String choice = inputchoice.next();
            choice = choice.toLowerCase(Locale.ROOT);
            if (choice.equals("show")) {
                System.out.print("Enter your password to shoe he data: ");
                Scanner inputpas = new Scanner(System.in);
                String password = inputpas.next();
                model1.Show(password);
                ;
                //model1.Show(pass);
            }else if (choice.equals("no")){
                System.out.println("Thanks for using our Service");
        } else if (option.equals("no")) {
            System.out.println("Thanks for using our Service");
        }

        }
    }
    }

