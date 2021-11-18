package Task1;

public class ExcelentPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("На відмінно. ");
    }

    @Override
    void read() {
        super.read();
        System.out.print("На відмінно. ");
    }

    @Override
    void write() {
        super.write();
        System.out.print("На відмінно. \n");

    }

    @Override
    void relax() {
        super.relax();
        System.out.print("На відмінно. ");
    }
}
