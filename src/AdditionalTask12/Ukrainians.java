package AdditionalTask12;

public class Ukrainians extends Europeans {
    public String name;
    public String country;
    public String cuisine;

    public Ukrainians() {
        this.country = "Ukraine";
        this.cuisine = "Borsch";
        this.name = "Ukrainians";
    }

    @Override
    public void eat() {

        System.out.println("Українці особливо любляїть їсти " + cuisine);
    }
}
