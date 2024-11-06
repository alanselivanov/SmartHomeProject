package smart_home.controller;

import smart_home.model.Device;
import smart_home.view.HomeView;

import java.util.ArrayList;
import java.util.List;

public class HomeController {
    private List<Device> devices;
    private HomeView view;

    public HomeController(HomeView view) {
        this.devices = new ArrayList<>();
        this.view = view;
    }
    
    public void addDevice(Device device) {
        devices.add(device);
        view.showDeviceAdded(device);
    }

    public void turnOnDevice(Device device) {
        device.turnOn();
        view.showDeviceStatus(device);
    }

    public void performDeviceFunction(Device device) {
        device.performFunction();
    }

    public void turnOffDevice(Device device) {
        device.turnOff();
        view.showDeviceStatus(device);
    }

    public List<Device> getDevices() {
        return devices;
    }
}
