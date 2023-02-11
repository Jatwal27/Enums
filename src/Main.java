
enum Date {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

    class EnumTest {
    Date day;
    public void myFavorit(){
        switch(day) {
            case MONDAY:
                System.out.println("Mondays are tough");
                break;
            case FRIDAY:
                System.out.println("Fridays are tough");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekdays are the best");
                break;
            case TUESDAY: case WEDNESDAY: case THURSDAY:
                System.out.println("Midweek days are okay");
                break;
        }
    }
    public static void main(String[] args) {

            EnumTest dayOfWeek = new EnumTest();
            dayOfWeek.day = Date.MONDAY;
            dayOfWeek.myFavorit();
        }
    }