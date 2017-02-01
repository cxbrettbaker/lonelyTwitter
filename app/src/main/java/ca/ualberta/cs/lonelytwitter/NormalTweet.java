package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet with a date.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet without a date.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
