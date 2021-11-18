package Task1;

import java.security.Permission;

public class ClassRoom {

    public ClassRoom(Pupil pupil, Pupil student) {
        pupil.read();
        pupil.relax();
        pupil.study();
        pupil.write();
        student.read();
        student.relax();
        student.study();
        student.write();
    }
    public static void main(String[] arg) {
        ClassRoom studentOne = new ClassRoom(new ExcelentPupil(), new BadPupil());
        ClassRoom studentTwo = new ClassRoom(new BadPupil(), new BadPupil());
        ClassRoom studentThree = new ClassRoom(new GoodPupil(), new GoodPupil());
    }
}
