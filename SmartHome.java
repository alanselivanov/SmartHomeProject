import java.util.ArrayList;
import java.util.List;

public class SmartHome {
    private List<Device> devices = new ArrayList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void activateAll() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void deactivateAll() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}