package smart_home;

import smart_home.controller.HomeController;
import smart_home.model.Device;
import smart_home.model.Thermostat;
import smart_home.view.HomeView;

public class Main {
    public static void main(String[] args) {
        HomeView view = new HomeView();
        HomeController controller = new HomeController(view);

        controller.addDevice(new Thermostat("Main Thermostat"));
        controller.addDevice(new Device("Living Room Light") {
            @Override
            public void performFunction() {
                System.out.println("The light is providing illumination.");
            }
        });

        for (Device device : controller.getDevices()) {
            controller.turnOnDevice(device);
            controller.performDeviceFunction(device);
            controller.turnOffDevice(device);
        }
    }
}
