public class Main {
    public static void main(String[] args) {
        System.out.println("Smart Home Project Started");

        Device light = new Device("Living Room Light", "Light");
        Device thermostat = new Device("Bedroom Thermostat", "Thermostat");

        light.turnOn();
        thermostat.turnOn();
    }
}