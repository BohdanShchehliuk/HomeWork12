package Task1;

public class BadPupil extends Pupil{
    @Override
    void study() {
        super.study();
        System.out.print("Погано. ");
    }
    @Override
    void read() {
        super.read();
        System.out.print("Погано. ");
    }
    @Override
    void write() {
        super.write();
        System.out.print("Погано. \n");
    }
    @Override
    void relax() {
        super.relax();
        System.out.print("Погано. ");
    }
}
