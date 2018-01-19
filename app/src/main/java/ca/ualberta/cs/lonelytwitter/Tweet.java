package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by harouna on 1/18/18.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() { return this.message; }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();
}
