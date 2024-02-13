package ai.dv.model;

public abstract class Shape {
	private double firstDimension;
	private double secondDimension;
	private double thirdDimension;
	public Shape() {
		/*default constructor*/
	}
	
	public Shape(double firstDimension) {
		this.firstDimension=firstDimension;
		this.secondDimension=0;
	}
	public Shape(double firstDimension,double secondDimension) {
		this.firstDimension=firstDimension;
		this.secondDimension=secondDimension;
	}
	public Shape(double firstDimension,double secondDimension,double thirdDimension) {
		this.firstDimension=firstDimension;
		this.secondDimension=secondDimension;
		this.thirdDimension=thirdDimension;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double getFirstDimension() {
		return this.firstDimension;
	}
	public double getSecondDimension() {
		return this.secondDimension;
	}
	public double getThirdDimension() {
		return this.thirdDimension;
	}
}
