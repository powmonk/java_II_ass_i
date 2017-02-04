package java_II_ass_I;

public class Box extends Rectangle{
	
	public Box(double lengthValue, double widthValue, double heightValue){
		super(lengthValue, widthValue);
		length = lengthValue;
		width  = widthValue;
		height = heightValue;
		
	}
	
	public double volume(){
		return super.area() * height;
	}
	
	public double surfaceArea(){
		return super.area() + 2*(length*height + width*height);
		
	}
	
	public double bodyDiagonalLength(){
		return super.diagonalLength() + Math.sqrt(Math.pow(height, 2));
	}
	
	public double angle(){
		return Math.sin(height / super.diagonalLength()) * (180/Math.PI);
	}
	
	private double length, width, height;

}
