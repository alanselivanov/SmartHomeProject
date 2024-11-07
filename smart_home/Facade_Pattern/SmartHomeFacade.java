package smart_home.Facade_Pattern;
import smart_home.controller.HomeController;
import smart_home.Observer_Pattern.DeviceManager;
import smart_home.model.Settings;
public class SmartHomeFacade {
    private HomeController homeController;
    private DeviceManager deviceManager;

    public SmartHomeFacade(HomeController homeController, DeviceManager deviceManager) {
        this.homeController = homeController;
        this.deviceManager = deviceManager;
    }

    public void turnOnAllDevices() {
        homeController.sendRequest("Turn on all devices");
    }

    public void turnOffAllDevices() {
        homeController.sendRequest("Turn off all devices");
    }

    public void activateSecurityMode() {
        deviceManager.changeState("Security Mode Activated");
    }

    public void setDefaultTemperature(int temperature) {
        Settings.getInstance().setDefaultTemperature(temperature);
        System.out.println("Default temperature set to: " + temperature);
    }
}
