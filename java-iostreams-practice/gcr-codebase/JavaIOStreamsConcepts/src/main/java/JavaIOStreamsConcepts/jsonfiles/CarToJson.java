package JavaIOStreamsConcepts.jsonfiles;

import org.json.JSONObject;

public class CarToJson {

	// Car fields
	private String brand;
	private String model;
	private int year;

	// Constructor
	public CarToJson(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// Main method
	public static void main(String[] args) {

		// Create Car object
		CarToJson car = new CarToJson("Toyota", "Fortuner", 2023);

		// Convert Car object to JSON
		JSONObject carJson = new JSONObject();
		carJson.put("brand", car.brand);
		carJson.put("model", car.model);
		carJson.put("year", car.year);

		// Print JSON
		System.out.println(carJson.toString(2));
	}
}
