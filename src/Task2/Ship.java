package Task2;

public class Ship extends Vehicle {
    public int passengers;
    public String port;
    public Ship() {
        super(200000,60,2005);
        this.passengers = 20;
        this.port = "Odesa";
        }
}
