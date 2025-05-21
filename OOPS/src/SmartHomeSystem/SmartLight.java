package SmartHomeSystem;

public class SmartLight extends BaseDevice implements Schedulable{

    public SmartLight(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Device: " + deviceName + " | Type: Smart Light");
    }

    @Override
    public void schedule(String time) {
        System.out.println(deviceName + " scheduled to turn ON at " + time);
    }
}
