package day6;

import java.util.logging.Logger;

public class ShoppingMallStaticPractice {
    public static void main(String[] args) {
        /* DoorStaticPractice doorIn = new DoorStaticPractice();
        doorIn.count += 1;

        DoorStaticPractice doorOut = new DoorStaticPractice();
        doorOut.count -=1;

        Logger.getGlobal().info(String.valueOf(doorIn.count));
        Logger.getGlobal().info(String.valueOf(doorOut.count));

         */ // we dont create object for static fields and method so we call field and method like below:

        DoorStaticPractice.count += 1;
        DoorStaticPractice.count -= 1;

        Logger.getGlobal().info(String.valueOf(DoorStaticPractice.count));

        Logger.getGlobal().info(DoorStaticPractice.getName());
    }

}
