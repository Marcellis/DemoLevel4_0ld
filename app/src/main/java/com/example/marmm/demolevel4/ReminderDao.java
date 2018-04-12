package com.example.marmm.demolevel4;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
    public interface ReminderDao {

        @Query("SELECT * FROM reminder")
        public List<Reminder> getAll();

        @Insert
        public void insertReminders(Reminder... reminders);
    }
