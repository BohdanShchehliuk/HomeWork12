package Task1;

public class GoodPupil extends Pupil {
    @Override
    void study() {
        super.study();
        System.out.print("Добре. ");
    }

    @Override
    void read() {
        super.read();
        System.out.print("Добре. ");
    }

    @Override
    void write() {
        super.write();
        System.out.print("Добре. \n");
    }

    @Override
    void relax() {
        super.relax();
        System.out.print("Добре. ");
    }
}
