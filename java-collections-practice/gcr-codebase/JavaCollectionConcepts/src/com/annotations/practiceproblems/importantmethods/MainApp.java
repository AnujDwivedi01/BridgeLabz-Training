package com.annotations.practiceproblems.importantmethods;

import java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) {

		Class<ServiceTasks> cls = ServiceTasks.class;

		for (Method method : cls.getDeclaredMethods()) {

			if (method.isAnnotationPresent(ImportantMethod.class)) {

				ImportantMethod imp = method.getAnnotation(ImportantMethod.class);

				System.out.println("Method: " + method.getName() + ", Level: " + imp.level());
			}
		}
	}
}
