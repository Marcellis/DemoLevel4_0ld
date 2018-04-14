package com.example.marmm.demolevel4;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by marmm on 10/25/17.
 */

@Entity
public class Reminder implements Parcelable {

    @PrimaryKey (autoGenerate = true)
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.uid);
        dest.writeString(this.mReminderText);
    }

    protected Reminder(Parcel in) {
        this.uid = in.readInt();
        this.mReminderText = in.readString();
    }

    public static final Parcelable.Creator<Reminder> CREATOR = new Parcelable.Creator<Reminder>() {
        @Override
        public Reminder createFromParcel(Parcel source) {
            return new Reminder(source);
        }

        @Override
        public Reminder[] newArray(int size) {
            return new Reminder[size];
        }
    };
}
