package com.annotations.practiceproblems.rolebasedaccess;

public class MainApp {

	public static void main(String[] args) {

		AdminService service = new AdminService();

		// Non-admin user
		UserContext.setRole("USER");
		AccessController.invokeMethod(service, "deleteUser");

		// Admin user
		UserContext.setRole("ADMIN");
		AccessController.invokeMethod(service, "deleteUser");
	}
}
