package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */
public class NegativeMood extends Mood {

    /**
     * Instantiates a new Negative mood with a date.
     *
     * @param date the date
     */
    public NegativeMood(Date date) {
        super(date, "Bad");
    }

    /**
     * Instantiates a new Negative mood without a date.
     */
    public NegativeMood() {
        super("Bad");
    }

    @Override
    public String getMood() {
        return "Feeling " + super.getMood();
    }
}

