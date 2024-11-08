package smart_home.model;

public abstract class DeviceDecorator extends Device {
    protected Device decoratedDevice;

    public DeviceDecorator(Device device) {
        super(device.getName());
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }

    @Override
    public void performFunction() {
        decoratedDevice.performFunction();
    }
}
