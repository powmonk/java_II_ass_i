package java_II_ass_I;

public class test {

	public static void main(String[] args) {
		Box cuboid = new Box(125, 10, 40);
		System.out.println("Area: " + cuboid.area());
		System.out.println("perimeter: " + cuboid.perimeter());
		System.out.println("diagonalLength: " + cuboid.diagonalLength());
		System.out.println("(Box)volume: " + cuboid.volume());
		System.out.println("(Box)surfaceArea: " + cuboid.surfaceArea());
		
		System.out.println("(Box)bodyDiagonalLength: " + cuboid.bodyDiagonalLength());
		System.out.println("(Box)angle: " + cuboid.angle());
		
		Polygon poly = new Polygon(17.5, 13);
		System.out.println();
		System.out.println(poly.polygonArea());
		System.out.println(poly.polygonPerimeter());
		

	}
}
