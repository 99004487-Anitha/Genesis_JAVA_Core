import java.util.Scanner;
public class MatchMain {

public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. ODI");

		System.out.println("2. T20");

		System.out.println("3. Test");
		int t=sc.nextInt();
		if(t==1)
		{
			ODIMatch temp=new ODIMatch();
			System.out.println("Enter the Current score");
			int t1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int t2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
			System.exit(0);
		}
		if(t==2)
		{
			T20Match temp=new T20Match();
			System.out.println("Enter the Current score");
			int t1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int t2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
			System.exit(0);
		}
		if(t==1)
		{
			TestMatch temp=new TestMatch();
			System.out.println("Enter the Current score");
			int t1=sc.nextInt();
			System.out.println("Enter the Current Over");
			int t2=sc.nextInt();
			System.out.println("Enter the Target Score");
			int t3=sc.nextInt();
			temp.setTarget(t3);
			temp.setCurrentscore(t1);
			temp.setCurrentover(t2);
			double t4=temp.calculateRunRate();
			int t5=temp.calculateBalls();
			temp.display(t4, t5);
			System.exit(0);
		}
				
	}

}
