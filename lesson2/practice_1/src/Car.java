public class Car{
    private String brand;
    private int year;
    private int price;
    private int speed;

    public Car(String brand, int year, int price, int speed) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()){
            this.brand = "Неизвестное название";
        }else{
            this.brand = brand;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2023){
            this.year = 2023;
        }else{
            this.year = year;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0){
            this.price = 65000;
        }else{
            this.price = price;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 45){
            this.speed =  120;
        }else{
            this.speed = speed;
        }
    }





















}