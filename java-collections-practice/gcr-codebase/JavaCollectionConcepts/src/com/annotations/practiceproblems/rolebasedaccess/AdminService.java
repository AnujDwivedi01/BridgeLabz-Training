package com.annotations.practiceproblems.rolebasedaccess;

public class AdminService {

	@RoleAllowed("ADMIN")
	public void deleteUser() {
		System.out.println("User deleted successfully");
	}

	public void viewProfile() {
		System.out.println("Viewing profile");
	}
}
