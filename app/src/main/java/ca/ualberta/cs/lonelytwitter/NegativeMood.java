package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */

public class NegativeMood extends Mood {

    public NegativeMood(Date date) {
        super(date, "Bad");
    }

    public NegativeMood() {
        super("Bad");
    }

    @Override
    public String getMood() {
        return "Feeling " + super.getMood();
    }
}

