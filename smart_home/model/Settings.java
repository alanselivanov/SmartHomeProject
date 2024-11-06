package smart_home.model;

public class Settings {
    private static Settings instance;
    private int defaultTemperature;

    private Settings() {
        this.defaultTemperature = 22;
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public int getDefaultTemperature() {
        return defaultTemperature;
    }

    public void setDefaultTemperature(int temperature) {
        this.defaultTemperature = temperature;
    }
}