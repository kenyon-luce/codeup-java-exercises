package AbstractClassesAndInterface;

public class Company {
    public static void main(String[] args){
        Accountant dan = new Accountant("Danny", "Accounting", 001);

        System.out.println("dan.name = " + dan.name);
        System.out.println("dan.department = " + dan.department);
        System.out.println(dan.work());
    }
}
