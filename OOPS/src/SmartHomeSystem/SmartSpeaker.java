package SmartHomeSystem;

public class SmartSpeaker extends BaseDevice implements VoiceControlled {
    public SmartSpeaker(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Device: " + deviceName + " | Type: Smart Speaker");
    }


    @Override
    public void processVoiceCommand(String command) {
        System.out.println(deviceName + " is processing voice command: \"" + command + "\"");
    }
}
