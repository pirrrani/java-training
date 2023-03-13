public class Heavy extends Car{
    private String SleepingPlace; //Наличие спального места

    public Heavy(String brand, int year, int price, int speed, String SleepingPlace) {
        super(brand, year, price, speed);
        this.SleepingPlace = SleepingPlace;
    }

    public String toString() {
        return "Название автомобиля:" + getBrand() + ", " + "Год выпуска:" + getYear() + ", " +
                "Цена:" + getPrice() + ", " + "Скорость:" + getSpeed() + ", " + "Наличие спального места:" + this.SleepingPlace;
    }

}
