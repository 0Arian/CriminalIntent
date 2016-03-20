package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by A on 2/6/2016.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mID = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }
    public UUID getID() {
        return mID;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

}
