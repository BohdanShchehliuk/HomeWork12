package AdditionalTask12;

public class Italian extends Europeans {
    public String name;
    public String country;
    public String cuisine;

    public Italian() {
        this.country = "Italy";
        this.cuisine = "Pizza";
        this.name = "Italians";
    }

    @Override
    public void eat() {

        System.out.println("Італійці особливо любляїть їсти " + cuisine);
    }

}
