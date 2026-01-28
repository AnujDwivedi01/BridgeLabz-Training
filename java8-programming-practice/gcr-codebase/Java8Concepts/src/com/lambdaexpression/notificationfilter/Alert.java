package com.lambdaexpression.notificationfilter;

class Alert {
	String type; // Emergency, Appointment, Info
	String message;

	Alert(String type, String message) {
		this.type = type;
		this.message = message;
	}

	@Override
	public String toString() {
		return type + " : " + message;
	}
}
