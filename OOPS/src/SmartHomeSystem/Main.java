package SmartHomeSystem;

public class Main {
    public static void main(String[] args) {

        // Call static method
        SmartDevice.displayWelcomeMessage();

        // Polymorphism: Referencing by interface/abstract class
        SmartDevice light = new SmartLight("Bedroom Light");
        SmartDevice speaker = new SmartSpeaker("Echo Dot");
        SmartDevice thermostat = new SmartThermostat("Nest");



        //Turn on all devices
        light.turnOn();
        speaker.turnOn();
        thermostat.turnOn();

        System.out.println();


        //Show Device Statuses

        System.out.println(light.getStatus());
        System.out.println(speaker.getStatus());
        System.out.println(thermostat.getStatus());


        //Use INSTANCE OF to safely cast and access extended Interface

        if (light instanceof Schedulable) {
            Schedulable schedulable = (Schedulable) light;
            schedulable.schedule("6:00 PM");
            schedulable.cancelSchedule(); // default method
        }

        if (speaker instanceof VoiceControlled voiceControl) {
            voiceControl.processVoiceCommand("Play music");
        }

        if (thermostat instanceof Schedulable s) {
            s.schedule("7:00 AM");
        }

        if (thermostat instanceof VoiceControlled v) {
            v.processVoiceCommand("Set temperature to 22°C");
        }


        System.out.println();

        // Device details
        ((BaseDevice) light).showDetails();
        ((BaseDevice) speaker).showDetails();
        ((BaseDevice) thermostat).showDetails();







    }
}
