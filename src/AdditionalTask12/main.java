package AdditionalTask12;

public class main {
    public static void main(String[] arg) {
        People people = new People();
        System.out.printf("Люди %s. Люди мають очі, ноги і руки в кількості %d\n", people.keyFeats, people.numbersOfLegsEysHands);
        people.eat();

        Ukrainians ukrainians = new Ukrainians();
        System.out.printf("%s жувуть в %s\n", ukrainians.name, ukrainians.country);
        ukrainians.eat();

        Italian italian = new Italian();
        System.out.printf("%s жувуть в %s\n", italian.name, italian.country);
        italian.eat();

        Germans germans = new Germans();
        System.out.printf("%s жувуть в %s\n", germans.name, germans.country);
        italian.eat();

    }
}
