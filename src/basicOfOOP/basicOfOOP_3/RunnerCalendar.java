package basicOfOOP.basicOfOOP_3;

import java.io.IOException;

public class RunnerCalendar {
    public static void main(String[] args) throws IOException {
        Calendar c = new Calendar(2020, 365, "saturday");

        // Дни недели.

        c.setWeekends(c.new Weekend());
//        c.getWeekends().weekends();
//        c.getWeekends().showWeekends();

        // Праздники.

        c.setHoliday(c.new Holiday());
//        c.getHoliday().addHoliday();
//        c.getHoliday().showHoliday();
    }
}
