package OOP;

class MarkSheet{
    //PRIVATE
    private String name;
    private String subject;
    private int marks;

    //CONSTRUCTOR
    /*
        Although are attributes are private but we set the value of our attributes
        with the constructor
     */
    public MarkSheet(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    //    We can overload the constructor methode

    public MarkSheet() {
        this.name="Student";
        this.subject="Subject";
        this.marks=0;
    }

    public MarkSheet(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Acess_Modiier {
    public static void main(String[] args) {

                /*
            As we define a constructor in our class so we have to pass the
            values of those attributes which we define in constructor
            in the braces at the time of initializing the instant of class
         */

        MarkSheet markSheet=new MarkSheet("X","X",0);

        /*
        since in class MarkSheet the all Attributes are private
        so we can't hit the attributes directly like
        markSheet.name="etc.."
        and
        markSheet.subject="etc.."
        and also we can't access the attribute value directly like

        System.out.println(markSheet.marks);

        if we access and set attributes with above methode we got
        an error due to private modifier in attributes

        we have to use the any methode which are predefine in the class
        commonly those methode are called getter and setter
         */

        markSheet.setName("Owais Ali");
        markSheet.setSubject("Calculus");
        markSheet.setMarks(95);


        System.out.println("Name: "+markSheet.getName());
        System.out.println("Subject Name: "+markSheet.getSubject());
        System.out.println("Marks: "+markSheet.getMarks());
    }
}
