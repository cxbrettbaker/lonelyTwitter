package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;

    ArrayList<Mood> moodList = new ArrayList<Mood>();

    public Tweet(Date date, String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    public Tweet(String message) throws TweetTooLongException {
        this.setMessage(message);
        this.date = new Date();
    }

    public abstract Boolean isImportant();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144) {
            throw new TweetTooLongException();
        }
        else {
            this.message = message;
        }
    }

    public void addMood(Mood mood){
        moodList.add(mood);
    }
}
