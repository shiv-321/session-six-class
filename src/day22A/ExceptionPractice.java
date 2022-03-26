package day22A;

import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionPractice {

    public static void main(String[] args) {

        MyImage myImage = new MyImage();
//        try {
//            myImage.downloadImage("http://facebook.com/1234564322.png");
//        }
//        catch(IOException e){
//            e.printStackTrace();
//            Logger.getGlobal().info(e.getMessage());
//        }
        try {
            myImage.downloadImage("http://facebook.com/1234564322.png");
            myImage.getImageUrl();
        } catch (RuntimeException e) {
            Logger.getGlobal().info("Opps! exception occurred");
            // message for programmer
        e.printStackTrace();
        // for sending message to user
        Logger.getGlobal().info(e.getMessage());
        }catch (IOException e){
            e.printStackTrace();
            Logger.getGlobal().info(e.getMessage());
        }
    }
}
/**
 * if both the method may throw an exception we can't put them in same try-catch block
 *
 */
