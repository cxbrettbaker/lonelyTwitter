package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */

public class PositiveMood extends Mood {

    public PositiveMood(Date date) {
        super(date, "Good!");
    }

    public PositiveMood() {
        super("Good!");
    }

    @Override
    public String getMood() {
        return "Feeling " + super.getMood();
    }
}
