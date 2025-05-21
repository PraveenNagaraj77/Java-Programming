package SmartHomeSystem;

public interface Schedulable {

    void schedule(String time);

    //Default Method with Optional
    default void cancelSchedule(){
        System.out.println("Schedule Cancelled");
    }

}
