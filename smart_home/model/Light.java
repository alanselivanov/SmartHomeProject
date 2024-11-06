package smart_home.model;

public class Light extends Device {

    public Light(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println("The light is providing illumination.");
    }
}
