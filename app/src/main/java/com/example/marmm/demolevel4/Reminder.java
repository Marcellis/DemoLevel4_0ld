package com.example.marmm.demolevel4;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by marmm on 10/25/17.
 */

@Entity
public class Reminder{

    @PrimaryKey
    private int uid;

    public String mReminderText;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Reminder(String mReminderText) {
        this.mReminderText = mReminderText;
    }

    public String getmReminderText() {
        return mReminderText;
    }

    public void setmReminderText(String mReminderText) {
        this.mReminderText = mReminderText;
    }

    @Override
    public String toString() {
        return mReminderText;
    }

        }
