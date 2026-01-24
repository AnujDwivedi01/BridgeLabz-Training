package com.annotations.practiceproblems.rolebasedaccess;

import java.lang.reflect.Method;

public class AccessController {

	public static void invokeMethod(Object obj, String methodName) {

		try {
			Method method = obj.getClass().getMethod(methodName);

			if (method.isAnnotationPresent(RoleAllowed.class)) {

				RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

				if (!roleAllowed.value().equals(UserContext.getRole())) {
					System.out.println("Access Denied!");
					return;
				}
			}

			// Allowed → invoke method
			method.invoke(obj);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
