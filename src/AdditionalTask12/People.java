package AdditionalTask12;

public class People implements Human {
    public String keyFeats;
    public String food;
    public int numbersOfLegsEysHands;

    public People() {
        this.keyFeats = "можуть думати і говорити";
        this.numbersOfLegsEysHands = 2;
          }

    @Override
    public void eat() {
        System.out.println("Кожна людина мусить їсти");
       }
}
