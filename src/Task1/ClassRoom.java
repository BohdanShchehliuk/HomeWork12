package Task1;

import java.security.Permission;

public class ClassRoom {

    public ClassRoom(Pupil pupil) {
        pupil.read();
        pupil.relax();
        pupil.study();
        pupil.write();
    }

    public static void main(String [] arg) {
    ClassRoom studentOne = new ClassRoom(new ExcelentPupil());
    ClassRoom studentTwo = new ClassRoom(new BadPupil());
    ClassRoom studentThree = new ClassRoom(new GoodPupil());
    }


}
