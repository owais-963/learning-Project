package OOP;

class Employ{
    int id      //Attribute
            ;
    String name  //Attribute
            ;

    int Salary;

    //Working with getter and setter

    //we can use getter and setter to override the value
    // and for get and set the value of Attributes


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+name);
        System.out.println("Salary is "+Salary );
    }

}

public class Objec_O_Programing {
    public static void main(String[] args) {
        Employ employ=new Employ(); //Instantiating a new Object
        employ.id= 1009; //setting attribute
        employ.name="Owais Ali"; //setting attribute
        System.out.println(employ.id); //printing attribute
        System.out.println(employ.name); //printing attribute
        Employ employ1=new Employ(); //Instantiating an another new Object
        employ1.id=1010;//setting attribute for new object employ 1
        employ1.name="Uzair Ali"; //setting attribute for new object employ 1
        //printing attribute for new object employ 1
        // by pre define methode of class Employ
        employ1.printDetails();

        Employ employ2=new Employ(); //Instantiating a new Object
        //Set Attribute with setter
        employ2.setId(1011);
        employ2.setName("Usaid Ullah");
        employ2.setSalary(200);

        //get Attributes with getter
        System.out.println(employ2.getId()+" "+
                employ2.getName()+" "+employ2.getSalary());
    }
}
