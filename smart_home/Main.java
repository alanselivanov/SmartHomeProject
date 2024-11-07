package smart_home;

import smart_home.Observer_Pattern.DeviceManager;
import smart_home.model.Camera;
import smart_home.model.Light;

import smart_home.ChainofResponsibility.DeviceHandler;
import smart_home.ChainofResponsibility.LightHandler;
import smart_home.ChainofResponsibility.ThermostatHandler;
import smart_home.Facade_Pattern.SmartHomeFacade;
import smart_home.ChainofResponsibility.CameraHandler;

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

        DeviceHandler lightHandler = new LightHandler();
        DeviceHandler thermostatHandler = new ThermostatHandler();
        DeviceHandler cameraHandler = new CameraHandler();


        lightHandler.setNextHandler(thermostatHandler);
        thermostatHandler.setNextHandler(cameraHandler);

        String request = "light";  
        lightHandler.handleRequest(request);

        request = "thermostat";
        lightHandler.handleRequest(request);

        request = "camera";
        lightHandler.handleRequest(request);

        request = "unknown";  
        lightHandler.handleRequest(request);


        DeviceManager deviceManager = new DeviceManager();

        Camera camera = new Camera("Front Door");
        Light light = new Light("Living Room");
        Thermostat thermostat1 = new Thermostat("Hallway");

        deviceManager.addObserver(camera);
        deviceManager.addObserver(light);
        deviceManager.addObserver(thermostat1);

        deviceManager.changeState("Security Mode Activated");
        deviceManager.changeState("Security Mode Deactivated");


        DeviceManager deviceManager2 = new DeviceManager();

        SmartHomeFacade facade = new SmartHomeFacade(controller, deviceManager2);

        facade.turnOnAllDevices();
        facade.activateSecurityMode();
        facade.setDefaultTemperature(24);
    }
}
