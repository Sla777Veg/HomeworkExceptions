import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);

    }

    @Override
    public boolean service() {
        return Math.random()>0.57;
    }

    @Override
    public String toString() {
        return "Car{" +

                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public void PitStop() {
        System.out.printf("Автомобиль %s совершил Пит-Стоп"+ "\n", this.brand);
    }

    @Override
    public int BestLap() {
        return ThreadLocalRandom.current().nextInt(1,1000);
    }

    @Override
    public int maxSpeed() {
        return ThreadLocalRandom.current().nextInt(1,400);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
