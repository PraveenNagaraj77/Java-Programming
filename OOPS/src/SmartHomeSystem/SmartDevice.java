package SmartHomeSystem;

public interface SmartDevice {

    void turnOn();
    void turnOff();
    String getStatus();

    //static method for utility or greeting

    static void displayWelcomeMessage(){
        System.out.println(" Welcome to the Smart Home System!");
    }


}
