package smart_home;

import smart_home.controller.HomeController;
import smart_home.model.Device;
import smart_home.model.Settings;
import smart_home.model.Thermostat;
import smart_home.view.HomeView;

public class Main {
    public static void main(String[] args) {
        HomeView view = new HomeView();
        HomeController controller = new HomeController(view);

        controller.addDevice("light", "Living Room Light");
        controller.addDevice("thermostat", "Main Thermostat");
        controller.addDevice("camera", "Front Door Camera");

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
            controller.applyDefaultTemperature(thermostat);
        }
    }
}
