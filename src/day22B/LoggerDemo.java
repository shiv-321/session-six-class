package day22B;
// Java program to illustrate logging in java
//Following example shows a basic code of how logging works in java

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    //Get the Logger from the log manager which corresponds to the given name<Logger.GLOBAL_LOGGER_NAME here>
    //
    public void makeSomeLog(){
        LOGGER.log(Level.INFO, "My first Log Message");
    }

public class GFG {


}
    public static void main(String[] args) {
        LoggerDemo obj = new LoggerDemo();
        obj.makeSomeLog();

        //Generating some log messages through the function defined above
        LogManager lgmngr = LogManager.getLogManager();

        //lgmngr now contains a reference to the log manager
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        //Getting the global appplication level logger from the java log Manager
        log.log(Level.INFO, "This is a log message");

        //create a log message to be displayed //The message has a level of Info

    }

}
