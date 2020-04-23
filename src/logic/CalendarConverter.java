package logic;

public class CalendarConverter {
    public static int   MONDAY       = 1,
                        TUESDAY      = 2,
                        WEDNESDAY    = 3,
                        THURSDAY     = 4,
                        FRIDAY       = 5,
                        SATURDAY     = 6,
                        SUNDAY       = 7;

    public static int[] DAYSOFWEEK = {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};

    public static String convertDayToString(int dayNumber){
        return switch(dayNumber){
                case 1 -> "Poniedziałek";
                case 2 -> "Wtorek";
                case 3 -> "Środa";
                case 4 -> "Czwartek";
                case 5 -> "Piątek";
                case 6 -> "Sobota";
                case 7 -> "Niedziela";
                default -> null;
        };
    }
}
