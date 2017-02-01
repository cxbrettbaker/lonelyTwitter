package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * The type Tweet.
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    /**
     * The Mood list.
     */
    ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }


    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(Mood mood){
        moodList.add(mood);
    }


    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}