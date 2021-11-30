package com.example.schlageproject;

public class AccessCode {
    // private final AccessCodeScheduleType _scheduleType;
    // Stretch goal: Include start and end times for temporary and recurring codes
    private final String _accessCodeID;
    private final String _name;
    private final String _accessCode;

    public AccessCode(String name, String accessCode, String accessCodeID) {
        this._accessCode = accessCode;
        this._accessCodeID = accessCodeID;
        this._name = name;
    }

    public String getAccessCode() {
        return this._accessCode;
    }

    public String getName() {
        return this._name;
    }

    public String getAccessCodeID() {
        return this._accessCodeID;
    }

    public int getAccessCodeLength() {
        return this._accessCode.length();
    }
}
