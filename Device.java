public class Device {
    private String name;
    private String type;
    private boolean isOn;

    public Device(String name, String type) {
        this.name = name;
        this.type = type;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

