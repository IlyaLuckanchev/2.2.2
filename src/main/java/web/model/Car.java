package web.model;

public class Car {
    private String model;
    private String color;
    private int price;


    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
