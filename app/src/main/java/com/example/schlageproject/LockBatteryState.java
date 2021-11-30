package com.example.schlageproject;

public enum LockBatteryState {
    NORMAL("Normal"),
    LOW("Low"),
    CRITICALLY_LOW("CriticallyLow"),
    UNKNOWN("Unknown");

    public final String label;

    LockBatteryState(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
