package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by wbaker on 1/17/17.
 */

public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important Tweet with a date.
     * @param date
     * @param message
     * @throws TweetTooLongException
     */
    public ImportantTweet(Date date, String message) throws TweetTooLongException {
        super(date, message);
    }

    /**
     * Instantiates a new Important Tweet without a date.
     * @param message
     * @throws TweetTooLongException
     */
    public ImportantTweet(String message) throws TweetTooLongException {
        super(message);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Alters the default getMessage function for Important Tweets.
     * @return the altered string
     */
    @Override

    public String getMessage() {
        return super.getMessage() + " !!!!";
    }
}