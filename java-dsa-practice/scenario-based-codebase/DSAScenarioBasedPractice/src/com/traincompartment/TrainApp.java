package com.traincompartment;

public class TrainApp {
	public static void main(String[] args) {
		Train train = new Train();

		train.addCompartment("Engine");
		train.addCompartment("General");
		train.addCompartment("Sleeper");
		train.addCompartment("Pantry");
		train.addCompartment("3rdAc");
		train.addCompartment("2ndAc");
		train.addCompartment("1stAc");
		train.addCompartment("Wifi");
		train.addCompartment("General");
		train.addCompartment("Gard");

		train.traverseForward();
		train.traverseBackward();

		train.showAdjacent("Pantry");

		train.removeCompartment("WiFi");

		train.traverseForward();
	}
}
