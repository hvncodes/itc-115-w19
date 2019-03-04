//import java.awt.Point; //uses awt Point

public class UsePoint {

	public static void main(String[] args) {
		//create new instance of the Point object
		Point p = new Point(2,3);
		
		System.out.println("Distance from 0: " + p.distanceFromOrigin());
		p.translate(2,-1);
		System.out.println(p.getX() + " and " + p.getY());
		
		Point p1 = new Point(7,2);
		Point p2 = new Point(0,0);
		Point p3 = new Point();
	
		System.out.println(p3.equals(p2));
		
		p2.setX(4);
		p2.setY(7);
		System.out.println(p3.equals(p2));
		System.out.println(p3.toString());
		System.out.println("Int: " + (int)p2.distanceFromOrigin() + 
				", Double: " + p2.distanceFromOrigin());
	}
}
