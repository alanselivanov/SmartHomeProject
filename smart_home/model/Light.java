package smart_home.model;

import smart_home.Observer_Pattern.Observer;

public class Light extends Device implements Observer {

    public Light(String name) {
        super(name);
    }

    @Override
    public void performFunction() {
        System.out.println("The light is providing illumination.");
    }

    @Override
    public void update(String message) {
        System.out.println("Light " + getName() + ": received notification - " + message);
    }
}
