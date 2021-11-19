package com.example.schlageproject;

public enum LockState {
    UNLOCKED("Unlocked"),
    LOCKED("Locked"),
    JAMMED("Jammed"),
    UNKNOWN("Unknown");

    public final String label;

    LockState(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
