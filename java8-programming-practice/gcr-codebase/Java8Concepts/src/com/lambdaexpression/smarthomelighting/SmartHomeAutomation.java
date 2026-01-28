package com.lambdaexpression.smarthomelighting;

public class SmartHomeAutomation {

	public static void main(String[] args) {

		SmartLight light = new SmartLight();

		// Motion detected
		LightAction motionDetected = () -> System.out.println(" Lights ON at 100% brightness");

		// Night time
		LightAction nightMode = () -> System.out.println(" Lights ON at 30% warm light");

		// Voice command
		LightAction voiceCommand = () -> System.out.println(" Lights turned BLUE for party mode");

		// Execute actions
		light.activate(motionDetected);
		light.activate(nightMode);
		light.activate(voiceCommand);
	}
}
