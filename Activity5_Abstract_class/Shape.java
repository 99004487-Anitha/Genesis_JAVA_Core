abstract class Shape
{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	abstract void  calculateArea(int value);
	
	
}
class Circle extends Shape
{
	void calculateArea(int value)
	{
		System.out.println("Area of circle is: "+Math.PI*value*value);
		
	}
}
class Square extends Shape
{
	void calculateArea(int value)
	{
		System.out.println("Area of Square is: "+value*value);
	
	}
}
