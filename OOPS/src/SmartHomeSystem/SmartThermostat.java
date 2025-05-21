package SmartHomeSystem;

public class SmartThermostat extends BaseDevice implements Schedulable,VoiceControlled {

    public SmartThermostat(String name){
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Device: " + deviceName + " | Type: Smart Thermostat");
    }


    @Override
    public void schedule(String time) {
        System.out.println(deviceName + " heating scheduled at " + time);
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + " processing command: " + command);
    }
}
