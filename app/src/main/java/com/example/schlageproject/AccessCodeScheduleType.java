package com.example.schlageproject;

public enum AccessCodeScheduleType {
    // Currently unused, but needed for stretch goal.

    ALWAYS("Always"),
    RECURRING("Recurring"),
    TEMPORARY("Temporary"),
    UNKNOWN("Unknown");

    public final String label;

    AccessCodeScheduleType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
