package smart_home.view;

import smart_home.model.Device;

public class HomeView {

    public void showDeviceAdded(Device device) {
        System.out.println("Added device: " + device.getName());
    }

    public void showDeviceStatus(Device device) {
        String status = device.isOn() ? "on" : "off";
        System.out.println(device.getName() + " is " + status);
    }
}