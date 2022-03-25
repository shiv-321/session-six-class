package day19;

public class Test1 {
    Day day;

    //constructor
    Test1(Day day){
        this.day = day;
    }
    //print a line about day using switch
    public void dayIsLike(){
        switch (day){
            case MONDAY:
                System.out.println("Monday are bad");
                break;
                case FRIDAY:
                System.out.println("Friday are best");
                break;
            case SATURDAY:

            case SUNDAY:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Mid-week days are not bad");
                break;

        }
    }

    public static void main(String[] args) {
        String str = "MONDAY";
        Test1 t1 = new Test1(Day.valueOf(str));
        t1.dayIsLike();
    }
}
