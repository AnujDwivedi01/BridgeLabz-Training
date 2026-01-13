package com.homenest;
class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 25);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF");
    }

    public void reset() {
        System.out.println("Camera reset: recording cleared");
    }
}
