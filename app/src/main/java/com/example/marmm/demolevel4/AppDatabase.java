package com.example.marmm.demolevel4;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


@Database(entities = {Reminder.class}, version = 1)
public abstract  class AppDatabase extends RoomDatabase {
        public abstract ReminderDao reminderDao();
    }


