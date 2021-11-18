package Task2;

public class Run {
    public static void main(String[] arg) {
        Plane plane = new Plane();
        System.out.printf("Основні параметри літка є такими: Вартість %d. Швидкість %d. Рік %d. Висота %d. " +
                "Кількість пасажирів %d.\n", plane.price, plane.speed, plane.year, plane.height, plane.passengers);
        Car car = new Car();
        System.out.printf("Основні параметри машини є такими: Вартість %d. Швидкість %d. Рік %d.\n",
                car.price, car.speed, car.year);
        Ship ship = new Ship();
        System.out.printf("Основні параметри катера є такими: Вартість %d. Швидкість %d. Рік %d. Порт %s. " +
                "Кількість пасажирів %d.\n", ship.price, ship.speed, ship.year, ship.port, ship.passengers);
    }
}
