package java_II_ass_I;

public class Box extends Rectangle{
	public Box(double lengthValue, double widthValue) {
		super(lengthValue, widthValue);
	}
	
	public Box(double lengthValue, double widthValue, double heightValue){
		length = lengthValue;
		width  = widthValue;
		height = heightValue;
	}
	
	public double volume(){
		return length * width * height;
	}
	
	public double surfaceArea(){
		return 2*(length*width + length*height + width*height);
		
	}
	
	public double bodyDiagonalLength(){
		return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public double angle(){
		
	}
	
	private double length, width, height;

}
