package ai.dv.ui;

import ai.dv.model.Triangle;

public class Program30ShapeApp {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(2.2,2.2,2.2);
		System.out.println("Perimeter of a Triangle: "+triangle.getPerimeter());
		System.out.println("Area of a Triangle: "+triangle.getArea());
	}

}
