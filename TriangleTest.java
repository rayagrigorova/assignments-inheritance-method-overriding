package InheritanceAndPolymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Draw the UML diagrams for the classes Triangle and GeometricObject and
		 * implement the classes. Write a test program that prompts the user to enter
		 * three sides of the triangle, a color, and a Boolean value to indicate whether
		 * the triangle is filled. The program should create a Triangle object with
		 * these sides and set the color and filled properties using the input. The
		 * program should display the area, perimeter, color, and true or false to
		 * indicate whether it is filled or not.
		 */
		Scanner sc = new Scanner(System.in);
		
		double s1, s2, s3;
		String color;
		boolean filled;
		
		System.out.println("Enter 3 sides:");
		
		try {
			s1 = sc.nextDouble();
			s2 = sc.nextDouble();
			s3  = sc.nextDouble();
			
			Triangle t1 = new Triangle (s1, s2, s3);
			
			System.out.println("Enter a color: ");
			color = sc.next();
			
			System.out.println("Enter if the shape is filled: ");
			filled = sc.nextBoolean();
			
			t1.setColor(color);
			t1.setFilled(filled);
			
			System.out.println("Area: " + t1.getArea() + 
					" Perimeter: " + t1.getPerimeter() + " To string: " + t1.toString());
			
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid data format");
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}

}
