package InheritanceAndPolymorphism;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateDeclared() {
		return dateCreated;
	}
	public void setDateDeclared(Date dateDeclared) {
		this.dateCreated = dateDeclared;
	}
	
	public String toString() {
		return ("created on " + dateCreated + "\n color: " + color + " and filled " + filled);
	}
	
}
