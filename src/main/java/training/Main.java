package training;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "n";
        String model;
        String type;
        double price;
        String insurance;
        do {
            try {
                System.out.println("-model");
                model = scan.next();
                System.out.println("-type");
                type = scan.next();
                Type carType = TypeFactory.getInstance(type);
                System.out.println("-price");
                price = scan.nextDouble();
                System.out.println("-insuranceType");
                insurance = scan.next();
                Insurance insuranceType = InsuranceFactory.getInstance(insurance);
                Car car = new Car(model,carType,insuranceType,price);
                System.out.println(car.toString());
                System.out.println("PREMIUM OF CAR IS " + car.premium());
            } catch (CarException ce) {
                System.out.println(ce.toString());
            }
            catch (Exception e) {
                System.out.println(e.toString());
            }
            System.out.println("Do you want to enter details of any other car (y/n):");
            choice = scan.next();
        } while (!choice.equalsIgnoreCase("n"));

    }

}
