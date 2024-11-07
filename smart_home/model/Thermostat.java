package smart_home.model;
import smart_home.Observer_Pattern.Observer;
public class Thermostat extends Device implements Observer {
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

    @Override
    public void update(String message) {
        System.out.println("Thermostat " + getName() + ": received notification - " + message);
    }
}