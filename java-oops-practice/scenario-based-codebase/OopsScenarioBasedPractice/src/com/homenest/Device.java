package com.homenest;

abstract class Device implements IControllable {

	protected String deviceId;
	private boolean status; 
	protected double energyUsage;

	protected String firmwareLog; 

	public Device(String deviceId, double energyUsage) {
		this.deviceId = deviceId;
		this.energyUsage = energyUsage;
		this.status = false;
		this.firmwareLog = "Firmware v1.0";
	}

	public boolean isOn() {
		return status;
	}

	protected void setStatus(boolean status) {
		this.status = status;
	}

	// Operator usage
	public double calculateEnergy(double hours) {
		return energyUsage * hours;
	}
}
