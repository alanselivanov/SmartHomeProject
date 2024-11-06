package smart_home.model;

public class Camera extends Device {

    public Camera(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println("The camera is monitoring the area.");
    }
}
