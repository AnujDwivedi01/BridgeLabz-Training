package com.inheritance.singleinheritance.problem2;

class Device {

    protected String deviceId;
    protected boolean status; // true = ON, false = OFF

    // Constructor
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

