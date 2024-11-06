public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();

        Device light = new Light();
        Device thermostat = new Thermostat();

        smartHome.addDevice(light);
        smartHome.addDevice(thermostat);

        smartHome.activateAll();
        smartHome.deactivateAll();
    }
}