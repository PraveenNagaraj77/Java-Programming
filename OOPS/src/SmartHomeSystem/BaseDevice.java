package SmartHomeSystem;

public abstract class BaseDevice implements SmartDevice {
    protected final String deviceName;
    protected boolean isOn;

    public BaseDevice(String name) {
        this.deviceName = name;
    }


    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is now ON ");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is now Off ");
    }

    @Override
    public String getStatus() {
        return isOn ?(deviceName + "is ON") : (deviceName + "is Off");
    }


    //Abstract method must be implemented by all subclasses

    public abstract  void showDetails();


}
