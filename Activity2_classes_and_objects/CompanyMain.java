import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c1 = new Company();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company name:");
		String name = sc.nextLine();
		System.out.println("Enter the employess:");
		String employees = sc.next();
		System.out.println("Enter TeamLead:");
		String teamlead = sc.next();
		
		
		int flag = 0;
        for(String str: employees.split(",")){
            if(teamlead.equals(str)){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        c1.setName(name);
		c1.setEmployees(employees);
		c1.setTeamlead(teamlead);
		 
		System.out.println("Name:"+c1.getName());
	     System.out.println("Employees:"+c1.getEmployees());
	     System.out.println("Lead:"+c1.getTeamlead());
		
		
		sc.close();
		
		
	}

}
