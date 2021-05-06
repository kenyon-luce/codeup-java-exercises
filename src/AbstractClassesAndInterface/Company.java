package AbstractClassesAndInterface;

public class Company {
    public static void main(String[] args) {
        Employee dan = new Accountant("Danny", "Accounting", 001);

        System.out.println("dan.name = " + dan.name);
        System.out.println("dan.department = " + dan.department);
        System.out.println("morning meeting: " + dan.morningMeeting());
        System.out.println(dan.work());
        System.out.println("morning lunchtime: " + dan.lunchTime());
        System.out.println("daily pay: " + dan.dailyPay());

        System.out.println();

        Employee joe = new Custodian("Joseph", "Custodian", 002);
        System.out.println("joe.name = " + joe.name);
        System.out.println("joe.department = " + joe.department);
        System.out.println("morning meeting: " + joe.morningMeeting());
        System.out.println(joe.work());
        System.out.println("morning lunchtime: " + joe.lunchTime());
        System.out.println("daily pay: " + joe.dailyPay());

        //whats the point of using an abstract method/ class?
        //less code, no need to overwrite, each employee has their own version of work()
    }
}
