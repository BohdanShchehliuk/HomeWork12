package Task2;

import java.util.Scanner;

public class Run {
    public static int carPrice(){
        System.out.println("ВВедіть ціну машини");
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        return price;
    };
    public static int carSpeed(){
        System.out.println("ВВедіть швидкість машини");
        Scanner input = new Scanner(System.in);
        int speed = input.nextInt();
        return speed;
    };
    public static int carYear(){
        System.out.println("ВВедіть рік машини");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        return year;
    };
    public static void main(String[] arg) {
        Car car = new Car(carPrice(),carSpeed(),carYear());
        System.out.printf("Основні параметри машини є такими: Вартість %d. Швидкість %d. Рік %d.\n",
                car.price, car.speed, car.year);
        Plane plane = new Plane();
        System.out.printf("Основні параметри літка є такими: Вартість %d. Швидкість %d. Рік %d. Висота %d. " +
                "Кількість пасажирів %d.\n", plane.price, plane.speed, plane.year, plane.height, plane.passengers);
        Ship ship = new Ship();
        System.out.printf("Основні параметри катера є такими: Вартість %d. Швидкість %d. Рік %d. Порт %s. " +
                "Кількість пасажирів %d.\n", ship.price, ship.speed, ship.year, ship.port, ship.passengers);
    }
  }
