package JavaIOStreamsConcepts.jsonfiles;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class ListToJsonArray {

	// POJO inside same class
	static class Car {
		public String brand;
		public String model;
		public int year;

		public Car(String brand, String model, int year) {
			this.brand = brand;
			this.model = model;
			this.year = year;
		}
	}

	public static void main(String[] args) throws Exception {

		// Create list of Car objects
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Toyota", "Fortuner", 2023));
		cars.add(new Car("Honda", "City", 2022));
		cars.add(new Car("Hyundai", "Creta", 2021));

		// Convert list to JSON array
		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);

		// Print JSON array
		System.out.println(jsonArray);
	}
}
