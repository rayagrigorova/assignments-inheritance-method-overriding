package InheritanceAndPolymorphism;

public class Triangle extends GeometricObject {
	/*
	 * Three double data fields named side1 , side2 , and side3 with default val-
	 * ues 1.0 to denote three sides of a triangle.
	 *  A no-arg constructor that
	 * creates a default triangle. 
	 * A constructor that creates a triangle with the
	 * specified side1 , side2 , and side3 .
	 *  The accessor methods for all three data
	 * fields. 
	 * A method named getArea() that returns the area of this triangle.
	 * A method named getPerimeter() that returns the perimeter of this triangle.
	 *  A method named printRectangle() that returns a string description for the
	 * triangle. 
	 * The printRectangle() method is implemented as follows: return
	 * "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	 */
	private double side1,side2,side3;
	
	Triangle(){
		super();
		setSide1(1);
		setSide2(1);
		setSide3(1);
	}
	
	Triangle(double side1, double side2, double side3){
		super();
		
		this.setSide1(side1);
		this.setSide2(side2);
		this.setSide3(side3);
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double p = getPerimeter() / 2;
		return ( Math.sqrt( p * (p - side1) * (p - side2) * (p - side3) ) );
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public void printRectangle() {
		System.out.println("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
	}
}
