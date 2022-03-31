package day23A;

import java.util.logging.Logger;

public record StudentRecordPractice() {
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord("Shiv", 21);
        StudentRecord sr1 = new StudentRecord("Shiv", 21);
        sr.name();
        sr.rollNumber();

        Logger.getGlobal().info(sr.toString());

        boolean isEqual = sr.equals(sr1);
        Logger.getGlobal().info(String.valueOf(isEqual));
    }

}
