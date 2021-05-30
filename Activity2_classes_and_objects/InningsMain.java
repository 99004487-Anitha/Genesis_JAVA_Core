import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		
		 Innings s = new Innings();
		    Scanner input = new Scanner(System.in);
		     System.out.println("Enter the team name:");
		     String teamname = input.next();
		     System.out.println("Enter session:");
		     String inningsname = input.next();
		     System.out.println("Enter runs:");
		     int runs = input.nextInt();
		     s.setTeamname(teamname);
		     s.setInningsname(inningsname);
		     s.setRuns(runs);
		     System.out.println("Employee Details");
		        System.out.println("Name: " + s.getTeamname());
		        System.out.println("Scored: " + s.getRuns());
		        if(s.getInningsname().equals("First")){
		            System.out.println("Need " + (s.getRuns()+1) + " to win");
		        } else {
		            System.out.println("Match Ended.");
		        }
		        

		        input.close();
		

	}

}
