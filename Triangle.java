package ai.dv.model;

public class Triangle extends Shape {

	public Triangle() {
		super();
	}

	public Triangle(double firstDimension, double secondDimension,double thirdDimension) {
		super(firstDimension, secondDimension, thirdDimension);
		
	}

	@Override
	public double getArea() {
        double s = (super.getFirstDimension() + super.getSecondDimension() + super.getThirdDimension()) / 2;
        return Math.sqrt(s * (s - super.getFirstDimension()) * (s - super.getSecondDimension()) * (s - super.getThirdDimension()));
    }


	@Override
	public double getPerimeter() {
		return super.getFirstDimension()+super.getSecondDimension()+super.getThirdDimension();
	}

}
