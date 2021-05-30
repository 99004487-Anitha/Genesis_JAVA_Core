import java.util.Scanner;

public class Number_count {

	
	static int findElementCount(int n, int arr[], int x)
	{ 
		
		int res = 0;
	        for (int i=0; i<n; i++)
	        {
	        if (x == arr[i]) 
	              res++;
	     
	        }
	        return res;
	             
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, x,i;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input");
		}
		
		int arr[] = new int[n];
		for(i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            if(arr[i]<0)
            {
            	System.out.println("Invalid input");
	        	System.exit(0);
            	
            }
        }
		 x = s.nextInt();
		 System.out.println(findElementCount(n,arr, x));
		 
		 
	}

}
