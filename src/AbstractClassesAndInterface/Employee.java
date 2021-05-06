package AbstractClassesAndInterface;

abstract class Employee {
    protected String name;
    protected String department;
    protected int id;

    public abstract String work();
    //^needs to be in abstract class to work

}
