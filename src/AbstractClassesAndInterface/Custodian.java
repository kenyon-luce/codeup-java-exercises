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
        return "Custodians have flexible meetings that are determined by the head of the maintenance department";
    }

    public String lunchTime(){
        return "12:00pm";
    }

    public int dailyPay() {
        return 100;
    }
}
