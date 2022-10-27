public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test", "test", "test");
        System.out.println(success);
        if (success) {
            System.out.println("Данные валидны");
        } else {
            System.out.println("Данные не валидны");
        }

        Car Lada = new Car("Lada","Granta",1.7);
        DriverB driverB = new DriverB("Вася",2, Lada);
        System.out.println(driverB);
        System.out.println(Lada);
        driverB.startMove();
        Lada.PitStop();
        driverB.refill();
        driverB.finishMove();
        System.out.println("Лучшее время круга: "+Lada.BestLap());
        System.out.println("Максимальная скорость: "+Lada.maxSpeed());

        Car Kia = new Car("Kia","Sportage", 2.4);
        DriverB driverB_2 = new DriverB("Коля",3, Kia);
        System.out.println(driverB_2);
        System.out.println(Kia);
        driverB_2.startMove();
        Kia.PitStop();
        driverB_2.refill();
        driverB_2.finishMove();
        System.out.println("Лучшее время круга: "+Kia.BestLap());
        System.out.println("Максимальная скорость: "+Kia.maxSpeed());

        Bus Ferrari = new Bus("Ferrari", "F-500", 3.4);
        DriverD driverD = new DriverD("Маша",5, Ferrari);
        System.out.println(driverD);
        System.out.println(Ferrari);
        driverD.startMove();
        Ferrari.PitStop();
        driverD.refill();
        driverD.finishMove();
        System.out.println("Лучшее время круга: "+Ferrari.BestLap());
        System.out.println("Максимальная скорость: "+Ferrari.maxSpeed());

        CargoCar Mercedes = new CargoCar("Mercedes", "SCLK", 4.1);
        DriverC driverC = new DriverC("Даша",10, Mercedes);
        System.out.println(driverC);
        System.out.println(Mercedes);
        driverC.startMove();
        Mercedes.PitStop();
        driverC.refill();
        driverC.finishMove();
        System.out.println("Лучшее время круга: "+Mercedes.BestLap());
        System.out.println("Максимальная скорость: "+Mercedes.maxSpeed());
        System.out.println();

        service(Lada, Kia, Ferrari, Mercedes);

    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {

            serviceTransport(transport);

        }

    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " +
                        transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}