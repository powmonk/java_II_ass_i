package java_II_ass_I;

public class Box extends Rectangle{
	
	public Box(double lengthValue, double widthValue, double heightValue){
		super(lengthValue, widthValue);
		length = lengthValue;
		width = widthValue;
		height = heightValue;
		
	}
	
	public double volume(){
		return super.area() * height;
	}
	
	public double surfaceArea(){
		return 2*(length * width + length*height + width*height);
		
	}
	
	public double bodyDiagonalLength(){
		return Math.sqrt(Math.pow(super.diagonalLength(), 2) + Math.pow(height, 2));
	}
	
	public double angle(){
		return Math.sin(height / super.diagonalLength()) * (180/Math.PI);
	}
	
	private double length, width, height;

}
