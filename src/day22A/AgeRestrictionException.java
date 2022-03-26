package day22A;

public class AgeRestrictionException extends RuntimeException{
    private String message;

   public AgeRestrictionException(String message){
        super(message);
    }

}
