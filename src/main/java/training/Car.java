package training;

public class Car {

    private String model;
    private Type type;
    private Insurance insurance;
    private double price;

    public Car(String model, Type type, Insurance insurance, double price) {
        this.model = model;
        this.type = type;
        this.insurance = insurance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", insurance=" + insurance +
                ", price=" + price +
                '}';
    }

    public double premium() {
        double premium = (type.getPremium()*price)/100;
        if ( insurance == Insurance.PREMIUM) {
            premium+= (insurance.premium()*premium)/100;
        }
        return premium;
    }

}
