public class Thermostat implements Device {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is set to heating mode.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is set to cooling mode.");
    }
}