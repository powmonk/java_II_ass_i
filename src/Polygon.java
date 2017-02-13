public class Polygon extends Isosceles{
	public Polygon(double lengthValue, double sidesValue){
		super(lengthValue);
		sides  = sidesValue;
	}
	
	public double polygonArea(){
		return sides * super.area(360 / sides); 
		
	}
	
	public double polygonPerimeter(){
		return sides * super.baseLength(360 / sides);
	}
	
	
	private double sides;
}
