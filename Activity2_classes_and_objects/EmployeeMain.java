import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee s = new Employee();
    Scanner input = new Scanner(System.in);
     System.out.println("Enter the name:");
     String name = input.next();
     System.out.println("Enter Adress:");
     String address = input.next();
     System.out.println("Enter Mobile:");
     String mobile = input.next();
     s.setName(name);
     s.setAddress(address);
     s.setMobile(mobile);
     
     System.out.println("Employee Details");
     System.out.println("Name:"+s.getName());
     System.out.println("Address:"+s.getAddress());
     System.out.println("Mobile:"+s.getMobile());
     
	}

}
