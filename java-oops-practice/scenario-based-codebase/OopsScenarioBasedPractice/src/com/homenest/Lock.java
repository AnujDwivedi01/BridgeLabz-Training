package com.homenest;
class Lock extends Device {

    public Lock(String deviceId) {
        super(deviceId, 5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Lock ENGAGED");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock DISENGAGED");
    }

    public void reset() {
        System.out.println("Lock reset: security keys refreshed");
    }
}
