package smart_home.ChainofResponsibility;

public interface DeviceHandler {
    void setNextHandler(DeviceHandler nextHandler);
    void handleRequest(String request);
}