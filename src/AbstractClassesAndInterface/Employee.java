package AbstractClassesAndInterface;

abstract class Employee {
    protected String name;
    protected String department;
    protected int id;

    //blank method (Abstract)
    public abstract String work();
    //^needs to be in abstract class to work

    public Employee(String name, String department, int id){
        this.name = name;
        this.department = department;
        this.id = id;
    }
}
