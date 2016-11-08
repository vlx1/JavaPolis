package hw.park;

import java.util.Scanner;

/**
 * Created by Viktor on 08.11.2016.
 */
public class CarPark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вместимость автопарка");
        int amountTransport = in.nextInt();
        Park park = new Park(amountTransport);
        System.out.println("Введите количество легковых");
        int amountCars = in.nextInt();
        for(int i=0;i<amountCars;i++) {
            Car car = new Car();
            park.addTransport(car);
        }
        System.out.println("Введите количество велосипедов");
        int amountBikes = in.nextInt();
        for(int i=0;i<amountBikes;i++) {
            Bike bike = new Bike();
            park.addTransport(bike);
        }
        System.out.println("Введите количество мотоциклов");
        int amountMotorcycles = in.nextInt();
        for(int i=0;i<amountMotorcycles;i++) {
            Motorcycle mcycle = new Motorcycle();
            park.addTransport(mcycle);
        }
        System.out.println("Введите количество джипов");
        int amountJeeps = in.nextInt();
        for(int i=0;i<amountJeeps;i++) {
            Jeep jeep = new Jeep();
            park.addTransport(jeep);
        }
        System.out.println("Введите номер машины для удаления");
        park.deleteTransport(in.nextInt());
        park.startAll();
    }
}
