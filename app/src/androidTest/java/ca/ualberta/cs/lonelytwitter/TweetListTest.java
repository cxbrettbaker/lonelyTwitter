package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by wbaker on 2/14/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test tweet");

        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

        try {
            tweets.add(tweet);
            assertTrue(false);
        }
        catch (IllegalArgumentException e){
            assertTrue(true);
        }

    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Another test tweet");

        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Last tweet");

        tweets.add(tweet);
        tweets.delete(tweet);

        assertFalse(tweets.hasTweet(tweet));
    }

    public void testStrings() {
        assertEquals("'test' should be 'test'", "test","test");
        assertTrue("'test' should start with 't'", "test".startsWith("t"));
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet 1");
        assertEquals(tweets.getCount(),0);
        tweets.add(tweet);
        tweet = new NormalTweet("Tweet 2");
        assertEquals(tweets.getCount(),1);
        tweets.add(tweet);
        tweet = new NormalTweet("Tweet 3");
        assertEquals(tweets.getCount(),2);
        tweets.add(tweet);
        tweet = new NormalTweet("Tweet 4");
        assertEquals(tweets.getCount(),3);
        tweets.add(tweet);
        assertEquals(tweets.getCount(),4);

    }

    public void testGetTweets() throws InterruptedException {
        TweetList tweets = new TweetList();
        Tweet tweetFirst = new NormalTweet("Earliest tweet");
        TimeUnit.SECONDS.sleep(5);
        Tweet tweetSecond = new NormalTweet("Later tweet");
        TimeUnit.SECONDS.sleep(5);
        Tweet tweetLast = new NormalTweet("Latest tweet");

        tweets.add(tweetLast);
        tweets.add(tweetSecond);
        tweets.add(tweetFirst);

        assertEquals(tweets.getTweet(0).getMessage(), "Latest tweet");
        assertEquals(tweets.getTweet(1).getMessage(), "Later tweet");
        assertEquals(tweets.getTweet(2).getMessage(), "Earliest tweet");

        List returnedTweet = tweets.getTweets();

        assertEquals(returnedTweet.get(0).toString(), tweetFirst.getMessage());
        assertEquals(returnedTweet.get(1).toString(), tweetSecond.getMessage());
        assertEquals(returnedTweet.get(2).toString(), tweetLast.getMessage());
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Duplicate tweet?");

        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));

    }


}
