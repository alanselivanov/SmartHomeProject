package smart_home.model;

public class NightModeDecorator extends DeviceDecorator {

    public NightModeDecorator(Device device) {
        super(device);
    }

    @Override
    public void performFunction() {
        super.performFunction();
        System.out.println("Night mode activated for " + getName());
    }
}
