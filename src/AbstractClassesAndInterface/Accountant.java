package AbstractClassesAndInterface;

public class Accountant extends Employee{
    public Accountant(String name, String department, int id){
        super(name, department, id); //overwrites Employee parameters with new ones
    }

    public String work(){
        //work() is an abstract (blank) method extended from Employee class, we can fill in the details here
        return "reports drafted";
    }
}
