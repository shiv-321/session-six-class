package day7;

import java.util.logging.Logger;

public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("I ");
        stringBuilder.append("am ");
        stringBuilder.append("a ");
        stringBuilder.append("Japanese ");
        stringBuilder.append("language ");
        stringBuilder.append("tutor");
        stringBuilder.append(".");

//        String concatinatedString = stringBuilder.toString();
//        Logger.getGlobal().info(concatinatedString);
        Logger.getGlobal().info(stringBuilder.toString());

    }
}
