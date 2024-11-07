package smart_home.ChainofResponsibility;

public class LightHandler implements DeviceHandler {
    private DeviceHandler nextHandler;
    
    @Override
    public void setNextHandler(DeviceHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("light")) {
            System.out.println("LightHandler is handling the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
