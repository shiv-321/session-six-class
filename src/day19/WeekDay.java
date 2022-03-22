package day19;

public enum WeekDay {
    SUNDAY("sun"), MONDAY("mon"), TUESDAY("tue"), WEDNESDAY("wed"), THURSDAY("thu"), FRIDAY("fri"), SATURDAY("sat");
    private String abbr;

    WeekDay(String abbr){
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
