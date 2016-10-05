package com.example.hangyang.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by hangyang on 2016/10/5.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }
    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();//别忘记初始化日期变量，以免发生NullPointerException
    }
}
