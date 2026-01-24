package com.annotations.practiceproblems.logintimes;

import java.lang.reflect.Method;

public class ExecutionTimeProcessor {

	public static void executeWithLogging(Object obj) {

		Class<?> cls = obj.getClass();

		for (Method method : cls.getDeclaredMethods()) {

			if (method.isAnnotationPresent(LogExecutionTime.class)) {
				try {
					long start = System.nanoTime();

					method.invoke(obj);

					long end = System.nanoTime();

					System.out.println("Method: " + method.getName() + " | Execution Time: " + (end - start) + " ns");

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
