
public class Point {
	//fields
	private int x;
	private int y;
	
	//constructor
	public Point() {
		this(0,0);
	}
	
	public Point(int initialX, int initialY) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		this.x = initialX;
		this.y = initialY;
	}
	
	//the methods
	//return the distance between the points and the origin (0,0)
	public double distanceFromOrigin() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	//shift location by a given amount
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Point) {
			Point p = (Point) o;
			return this.x == p.x && this.y == p.y;
		} else { //not a Point object
			return false;
		}
	}
	
	public String toString() {
		return "(" + this.x + ", "  + this.y + ")";
	}
}
