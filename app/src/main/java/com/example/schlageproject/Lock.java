package com.example.schlageproject;

import java.util.ArrayList;

public class Lock {
    // All of the Lock variables we care about.
    private final LockState _lockState; // Constants used to indicate the state of the device.
    private final LockBatteryState _lockBatteryState; // Potential set of values that can be assigned to battery state.
    private final String _modelName; // Human readable model name to present to users
    private final String _serialNumber; // Serial number of the device
    private final String _id; // Device unique identification - uuid
    private final String _name; // Device friendly name
    private final ArrayList<AccessCode> _accessCodes;

    public Lock(LockState lockState, LockBatteryState lockBatteryState, String modelName, String serialNumber, String id, String name, ArrayList<AccessCode> accessCodes) {
        this._lockState = lockState;
        this._lockBatteryState = lockBatteryState;
        this._modelName = modelName;
        this._serialNumber = serialNumber;
        this._id = id;
        this._name = name;
        this._accessCodes = accessCodes;
    }

    public String getLockID() {
        return this._id;
    }

    public String getName() {
        return this._name;
    }

    public LockState getLockState() {
        return this._lockState;
    }

    public LockBatteryState getLockBatteryState() {
        return this._lockBatteryState;
    }

    public String getModelName() {
        return this._modelName;
    }

    public String getSerialNumber() {
        return this._serialNumber;
    }

    public ArrayList<AccessCode> getAccessCodes() {
        return this._accessCodes;
    }

    public void changeLockState(LockState lockState) {
        /* @param lockState: Desired LockState for this lock.
        * Check if lock is already in this state.
        * If not, call the appropriate
        * */
        switch (lockState) {
            case LOCKED:

            case UNLOCKED:

            default:

        }
    }
}