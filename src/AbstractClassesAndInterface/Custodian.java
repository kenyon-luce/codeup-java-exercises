package AbstractClassesAndInterface;

public class Custodian extends Employee{

    public Custodian(String name, String department, int id){
        super(name, department, id);
    }

    public String work(){
        return "maintaining the building";
        //^calling on this abstract method removes class error
    }
}
