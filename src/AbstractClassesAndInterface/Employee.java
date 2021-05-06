package AbstractClassesAndInterface;

abstract class Employee implements DailyWork{
    //we have implemented our DailyWork interface (which contains all our methods) to our abstract Employee class. Since Accountant and Custodian are extended from Employee, they can overwrite the abstract methods from that interface
    protected String name;
    protected String department;
    protected int id;

    //blank method (Abstract)
//    public abstract String work();
    //^needs to be in abstract class to work

    //no need for this anymore since we connected interface (we are using work() from interface)

    public Employee(String name, String department, int id){
        this.name = name;
        this.department = department;
        this.id = id;
    }
}
