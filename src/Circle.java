
public class Circle {
	
	static final double PI = 3.141592653589793;
	
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void showArea()
	{
		System.out.println(this.radius * this.radius * PI);
	}
}
