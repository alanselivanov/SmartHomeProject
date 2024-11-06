package smart_home.model;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    @Override
    public void performFunction() {
        System.out.println("The thermostat is set to " + temperature + " degrees.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + " degrees.");
    }
}