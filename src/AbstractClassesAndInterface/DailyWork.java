package AbstractClassesAndInterface;

//INTERFACE : series of methods
public interface DailyWork {
    String businessHours = "9:00 to 5:00, Monday through Friday";

    String work();
    String morningMeeting();
    String lunchTime();

    int dailyPay();
}
