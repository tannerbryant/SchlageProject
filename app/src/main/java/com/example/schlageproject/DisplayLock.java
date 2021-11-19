package com.example.schlageproject;

public class DisplayLock implements Lock{
    private final String _id;
    private final String _name;


    public DisplayLock(String lockID, String lockName) {
        this._id = lockID;
        this._name = lockName;
    }

    public DisplayLock(String lockID) {
        this(lockID, "Unnamed Lock");
    }

    @Override
    public String getName() {
        return this._name;
    }

    @Override
    public String getLockID() {
        return this._id;
    }
}
