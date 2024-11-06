package smart_home;

import smart_home.controller.HomeController;
import smart_home.model.Device;
import smart_home.model.Settings;
import smart_home.model.Light;
import smart_home.model.Thermostat;
import smart_home.model.Camera;
import smart_home.view.HomeView;

public class Main {
    public static void main(String[] args) {
        HomeView view = new HomeView();
        HomeController controller = new HomeController(view);

        // Adding devices
        controller.addDevice(new Light("Living Room Light"));
        controller.addDevice(new Thermostat("Main Thermostat"));
        controller.addDevice(new Camera("Front Door Camera"));

        // Interacting with devices
        for (Device device : controller.getDevices()) {
            controller.turnOnDevice(device);
            controller.performDeviceFunction(device);
            controller.turnOffDevice(device);
        }

        Settings.getInstance().setDefaultTemperature(24);
        Thermostat thermostat = (Thermostat) controller.getDevices().stream()
                .filter(device -> device instanceof Thermostat)
                .findFirst()
                .orElse(null);

        if (thermostat != null) {
            System.out.println("Applying default temperature from settings...");
            thermostat.setTemperature(Settings.getInstance().getDefaultTemperature());
        }
    }
}
