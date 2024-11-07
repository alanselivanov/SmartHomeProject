package smart_home.model;



import smart_home.Observer_Pattern.Observer;

public class Camera extends Device implements Observer {

    public Camera(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println("The camera is monitoring the area.");
    }

    @Override
    public void update(String message) {
        System.out.println("Camera " + getName() + ": received notification - " + message);
    }
}
