package smart_home.model;

public class DeviceFactory {

    public static smart_home.model.Device createDevice(String type, String name) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(name);
            case "thermostat":
                return new Thermostat(name);
            case "camera":
                return new Camera(name);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}