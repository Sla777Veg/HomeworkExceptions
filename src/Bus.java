import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+getModel()+" в диагностике не требуется");
        return true;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void PitStop() {
        System.out.printf("Автобус %s совершил Пит-Стоп"+ "\n", this.brand);
    }

    @Override
    public int BestLap() {
        return ThreadLocalRandom.current().nextInt(1,1500);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,180);
    }
}
