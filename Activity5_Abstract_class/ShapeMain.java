import java.util.Scanner;

public class ShapeMain {



	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape");
		String t=sc.next();
		if(t.equals("Square"))
		{   System.out.println("Enter the side:");
			Square temp=new Square();
			int t1=sc.nextInt();
			temp.calculateArea(t1);
		}
		else
		{
			System.out.println("Enter the radius:");
			Circle temp=new Circle();
			int t1=sc.nextInt();
			temp.calculateArea(t1);
			
		}
	}
}
