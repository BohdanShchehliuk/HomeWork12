package AdditionalTask12;

public class Germans extends Europeans {
    public String name;
    public String country;
    public String cuisine;

    public Germans() {
        this.country = "Germany";
        this.cuisine = "sausages";
        this.name = "Germans";
    }

    @Override
    public void eat() {
        System.out.println("Німці особливо любляїть їсти " + cuisine);
    }
}
