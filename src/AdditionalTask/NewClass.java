package AdditionalTask;

public class NewClass extends Printer {
    public static final String ANSI_RED = "\u001B[31m";

    @Override
    void print(String value) {
        System.out.println(ANSI_RED + value);
    }
}
