package smart_home.model;

public abstract class Device {
    private String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " turned on.");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " turned off.");
    }

    public abstract void performFunction();
}