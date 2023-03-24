public class Phone {
    private String model;
    private String number;
    private String color;
    private boolean type;

    public Phone(String model, String number, String color, boolean type) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
