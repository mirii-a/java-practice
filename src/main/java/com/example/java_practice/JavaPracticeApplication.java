package com.example.java_practice;

import com.example.java_practice.constructors.rectangle.Rectangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaPracticeApplication.class, args);

		Rectangle rectangle = new Rectangle(5L, 15L);
		Rectangle copyRectangle = new Rectangle(rectangle);

		System.out.println("Rectangle: " + rectangle.getLength() + ", " + rectangle.getWidth());
		System.out.println("Copy rectangle: " + copyRectangle.getLength() + ", " + copyRectangle.getWidth());
	}

}
