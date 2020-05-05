package edu.matoleot.android.currentweek.utils;

import java.util.Calendar;

public class DateUtils {

    public DateUtils() {
        //Empty
    }

    /**
     * Return true if weekNumber param is the current week number. If not, return false.
     */
    public boolean isTheCurrentWeekNumber(int weekNumber) {
        return getCurrentWeekNumber() == weekNumber;
    }

    private int getCurrentWeekNumber() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }
}
