package AbstractClassesAndInterface;

public class Custodian extends Employee{

    public Custodian(String name, String department, int id){
        super(name, department, id);
    }

    public String work(){
        return "maintaining the building";
        //^calling on this abstract method removes class error
    }

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
