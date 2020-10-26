package com.example.taskmanager.model;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID mId;
    private String mTaskTitle;
    private State mTaskState;
    private String mTaskDescription;
    private Date mTaskDate;
    private String mUsername;
    public Task(UUID uuid, String title, String description, Date taskDate, String username, State taskState) {
        this.mId = uuid;
        this.mTaskTitle = title;
        this.mTaskState = taskState;
        this.mTaskDescription = description;
        this.mTaskDate = taskDate;
        this.mUsername = username;
    }

    public UUID getId() {
        return mId;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUser(String mUser) {
        this.mUsername = mUser;
    }


    public String getTaskDescription() {
        return mTaskDescription;
    }

    public void setTaskDescription(String mTaskDescription) {
        this.mTaskDescription = mTaskDescription;
    }

    public Date getTaskDate() {
        return mTaskDate;
    }

    public void setTaskDate(Date mTaskDate) {
        this.mTaskDate = mTaskDate;
    }

    public String getTaskTitle() {
        return mTaskTitle;
    }

    public void setTaskTitle(String taskName) {
        mTaskTitle = taskName;
    }

    public State getTaskState() {
        return mTaskState;
    }

    public void setTaskState(State taskState) {
        mTaskState = taskState;
    }

    public Task(String mTaskTitle, State mTaskState, String mTaskDescription, Date mTaskDate, String mUsername) {
        this.mId = UUID.randomUUID();
        this.mTaskTitle = mTaskTitle;
        this.mTaskState = mTaskState;
        this.mTaskDescription = mTaskDescription;
        this.mTaskDate = mTaskDate;
        this.mUsername = mUsername;
    }

    public Task(UUID id) {
        mId = id;
        mTaskDate = new Date();


    }

    public Task(String username) {
        this(UUID.randomUUID());
        this.mUsername = username;
    }
    public Task(){
        this(UUID.randomUUID());

    }
}
