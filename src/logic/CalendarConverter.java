package logic;

public class CalendarConverter {
    public final static int     MONDAY       = 1,
                                TUESDAY      = 2,
                                WEDNESDAY    = 3,
                                THURSDAY     = 4,
                                FRIDAY       = 5,
                                SATURDAY     = 6,
                                SUNDAY       = 7;

    public static int[] DAYSOFWEEK = {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};

    public static String convertDayToString(int dayNumber){
        return switch(dayNumber){
                case MONDAY      -> "Poniedziałek";
                case TUESDAY     -> "Wtorek";
                case WEDNESDAY   -> "Środa";
                case THURSDAY    -> "Czwartek";
                case FRIDAY      -> "Piątek";
                case SATURDAY    -> "Sobota";
                case SUNDAY      -> "Niedziela";
                default          -> null;
        };
    }
}
