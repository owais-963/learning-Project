package OOP;
import java.util.Locale;

public class UserProfile {
    public String fname;
    public String lname;
    public String age;
    public String email;
    public String phone_no;
    public String password;
    public String[] user_info;

    public UserProfile(String fname, String lname, String age, String email, String phone_no) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.email = email;
        this.phone_no = phone_no;
    }

    public void user_info(String password) {
        this.password=password;
        String[] user_Info = {this.fname + " " + this.lname, this.age, this.email, this.phone_no};
        this.user_info = user_Info;
    }

    public void Show(String password) {
        String msg = "Password Incorrect Aces Denied ";
        if (password.equals(this.password)) {
            System.out.println("Name: "+this.user_info[0]);
            System.out.println("Age: "+this.user_info[1]);
            System.out.println("Email: "+this.user_info[2]);
        } else {
            System.out.println(msg);
        }

    }
    public void update_data(String Fname,String Lname,String Age,String Email,String Phone_no,String password){
        this.fname=Fname;
        this.lname=Lname;
        this.age=Age;
        this.email=Email;
        this.phone_no=Phone_no;
        this.password=password;

    }
}