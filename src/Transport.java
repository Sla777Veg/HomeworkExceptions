import java.util.Objects;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    double engineVolume;

    public abstract void startMove();
    public abstract void finishMove();

    public Transport(String brand, String model, double engineVolume) {

        this.brand = Objects.requireNonNullElse(brand, "default");

        this.model = Objects.requireNonNullElse(model, "default");

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    //Геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract boolean service();
}