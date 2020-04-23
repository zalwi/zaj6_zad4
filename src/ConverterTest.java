import logic.CalendarConverter;

class ConverterTest {
    public static void main(String[] args) {
        for(int numberOfDay : CalendarConverter.DAYSOFWEEK){
            System.out.println(numberOfDay + " dzień tygodnia to " + CalendarConverter.convertDayToString(numberOfDay));
        }
    }
}
