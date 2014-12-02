
public class Square {

	private double length;
	
	public Square(double length)
	{
		this.length = length;
	}
	
	public void showArea()
	{
		System.out.println(this.length * this.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Square(10).showArea();
		new Circle(10).showArea();
	}

}
