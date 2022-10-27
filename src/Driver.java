public abstract class Driver<T extends Transport>  {
    private final String fullName;
    private String category;
    private final int yearsExperience;
    private T car;

    public Driver(String fullName, String category, int yearsExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.yearsExperience = yearsExperience;
        this.car = car;
        setCategory(category);

    }

    public void startMove() {
        System.out.printf("Водитель %s стартует"+ "\n", this.fullName);
        this.car.startMove();
    }

    public void finishMove() {
        System.out.printf("Водитель %s завершает заезд"+ "\n", this.fullName);
        this.car.finishMove();
    }

    public void refill() {
        System.out.printf("Водитель %s заправляет %s %s"+ "\n",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }


    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCar(T car) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем" +
                        " %s %s и будет учавствовать в заезде"+"\n",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }
}
