public class Box extends Rectangle{
	
	public Box(double lengthValue, double widthValue, double heightValue){
		super(lengthValue, widthValue);
		height = heightValue;
		
	}
	
	public double volume(){
		return super.area() * height;
	}
	
	public double surfaceArea(){
		return 2 * super.area() + super.perimeter() * height;
	}
	
	public double bodyDiagonalLength(){
		return Math.sqrt(Math.pow(super.diagonalLength(), 2) + Math.pow(height, 2));
	}
	
	public double angle(){
		return Math.toDegrees(Math.atan(height / super.diagonalLength()));
	}
	
	private double height;

}
