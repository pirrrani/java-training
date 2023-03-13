public class Light extends Car {
    private int NoP; //Кол-во пассажирских мест
    private String BabySeat; //Наличие детского сидения

    public Light(String brand, int year, int price, int speed, int NoP, String BabySeat) {
        super(brand, year, price, speed);
        this.NoP = NoP;
        this.BabySeat = BabySeat;
    }

    public String toString(){
        return "Название автомобиля:" + getBrand() + ", " + "Год выпуска:" + getYear() + ", " +
                "Цена:" + getPrice() + ", " + "Скорость:" + getSpeed() + ", " + "Кол-во мест:" + this.NoP + ", " + "Детское кресло:" + this.BabySeat;
    }


}
