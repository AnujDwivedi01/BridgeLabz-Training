package com.homenest;

class Light extends Device {

	public Light(String deviceId) {
		super(deviceId, 10);
	}

	public void turnOn() {
		setStatus(true);
		System.out.println("Light ON");
	}

	public void turnOff() {
		setStatus(false);
		System.out.println("Light OFF");
	}

	public void reset() {
		System.out.println("Light reset: brightness set to default");
	}
}
