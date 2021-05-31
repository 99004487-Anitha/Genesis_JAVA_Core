import java.util.*;
public class VehicleMain {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		int choice=sc.nextInt();
        	String make,number,audio,ftype,ksa;
        	int ftypech,capacity,cc,doors;
        	switch(choice){
            	case 1:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Audio System");
                audio=sc.next();
                System.out.println("Number of Doors");
                doors=sc.nextInt();
                FourWheeler car=new FourWheeler(make,number,ftype,capacity,cc,audio,doors);
                car.displayMake();
                car.displayBasicInfo();
                car.displayDetailInfo();
            	break;
            	case 2:
                System.out.println("Vehicle Make");
                make=sc.next();
                System.out.println("Vehicle Number");
                number=sc.next();
                System.out.println("Fuel Type: \n 1.Petrol \n 2.Diesel");
                ftypech=sc.nextInt();
                if(ftypech==1)
                {
                    ftype="Petrol";
                }
                else
                {
                    ftype="Diesel";
                }
                System.out.println("Fuel Capacity");
                capacity=sc.nextInt();
                System.out.println("Engine CC");
                cc=sc.nextInt();
                System.out.println("Kick Start Available");
                ksa=sc.next();
                
                if(ksa.equals("yes"))
                {
                TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,true);
                bike.displayMake();
                bike.displayBasicInfo();
                bike.displayDetailInfo();
                }
                else
                {
                    TwoWheeler bike=new TwoWheeler(make,number,ftype,capacity,cc,false);
                    bike.displayMake();
                    bike.displayBasicInfo();
                    bike.displayDetailInfo();
                }
            break;
        }

        sc.close();
	}

}
