package AbstractClassesAndInterface;

public class Accountant extends Employee {
    public Accountant(String name, String department, int id){
        super(name, department, id); //overwrites Employee parameters with new ones
    }

    public String work(){
        //work() is an abstract (blank) method extended from Employee class, we can fill in the details here
        return "reports drafted";
    }

    //including methods from DailyWork.java interface
    public String morningMeeting(){
        return "Accountants have meetings beginning at 8:15AM";
    }

    public String lunchTime(){
        return "1:00pm";
    }

    public int dailyPay() {
        return 500;
    }
}
