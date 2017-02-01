package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */
public class PositiveMood extends Mood {

    /**
     * Instantiates a new Positive mood with a date.
     *
     * @param date the date
     */
    public PositiveMood(Date date) {
        super(date, "Good!");
    }

    /**
     * Instantiates a new Positive mood without a date.
     */
    public PositiveMood() {
        super("Good!");
    }

    @Override
    public String getMood() {
        return "Feeling " + super.getMood();
    }
}
