package com.annotations.practiceproblems.todoannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {

	String task(); // Description of task

	String assignedTo(); // Developer responsible

	String priority() default "MEDIUM";
}
