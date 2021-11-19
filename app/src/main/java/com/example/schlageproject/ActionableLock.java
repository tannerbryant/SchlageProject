package com.example.schlageproject;

import java.util.ArrayList;

public class ActionableLock implements Lock {
    // All of the Lock variables we care about.
    private final LockState lockState; // Constants used to indicate the state of the device.
    private final LockBatteryState lockBatteryState; // Potential set of values that can be assigned to battery state.
    private final String modelName; // Human readable model name to present to users
    private final String serialNumber; // Serial number of the device
    private final String id; // Device unique identification - uuid
    private final String name; // Device friendly name
    private final ArrayList<AccessCode> accessCodes;

    public ActionableLock(LockState lockState, LockBatteryState lockBatteryState, String modelName, String serialNumber, String id, String name, ArrayList<AccessCode> accessCodes) {
        this.lockState = lockState;
        this.lockBatteryState = lockBatteryState;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.id = id;
        this.name = name;
        this.accessCodes = accessCodes;
    }

    @Override
    public String getLockID() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public LockState getLockState() {
        return this.lockState;
    }

    public LockBatteryState getLockBatteryState() {
        return this.lockBatteryState;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void changeLockState(LockState lockState) {
        /* @param lockState: Desired LockState for this lock.
        * Check if lock is already in this state.
        * If not, call the appropriate
        * */
        switch (lockState) {

        }
    }
}