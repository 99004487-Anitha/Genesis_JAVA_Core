import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer t = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		String string = sc.next();
		String delimiter = "[,]";
		String temp[];
		temp = string.split(delimiter); 
		
		t.setName(temp[0]);   
		t.setAddress(temp[1]);
		t.setMobile(temp[2]);
		System.out.println("Name:"+t.getName());
	     System.out.println("Address:"+t.getAddress());
	     System.out.println("Mobile:"+t.getMobile());
		
		}

}
