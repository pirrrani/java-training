public class Car {
    private String marka;
    private int year;
    private String number;

    public Car(String marka, int year, String number) {
        this.marka = marka;
        this.year = year;
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
