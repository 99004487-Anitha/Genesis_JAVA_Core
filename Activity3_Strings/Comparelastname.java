import java.util.Scanner;

public class Comparelastname {

    public static void main(String[] args) {
		

		Comparelastname c1 = new Comparelastname();
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		String string2 = input.nextLine();
		String delimiter = " ";
		String temp[];
		temp = string1.split(delimiter); 
		String temp2[];
		temp2 = string2.split(delimiter); 
		
		if(temp[1].equals(temp2[1]))
		{System.out.println("YES");}
		else
	    {System.out.println("NO");
		}

}

}
