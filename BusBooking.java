import java.util.Scanner;
import java.util.ArrayList;
public class BusBooking
{
    int agej;
    //Below Method will show the passenger details in the output panel.
    public void prsnDetailsConfirmation(String name,String age){
        //conversion to interger from String.
        agej=Integer.parseInt(age);
        //Checking the condition psngr with age.
        if(agej>5 && agej<65){
            System.out.println("Name "+name+" and age is "+agej+". No Discount on ticket.");
        }else if(agej>=65){
            System.out.println("Name "+name+" and age is "+agej+". 30% Discount on ticket.");
        }else{
            System.out.println("Name "+name+" and age is "+agej+". No Price on ticket.");
        }
    }
	public static void main(String[] args) {
	    //created Object for Scanner class.
	    Scanner reader=new Scanner(System.in);
		System.out.println("Enter Source Location name.");
		//Name of the passenger Source location.
		String src=reader.nextLine();
		System.out.println("Enter Destination Location name.");
		//Name of the passenger Destination Location.
		String dest=reader.nextLine();
		System.out.println("Any distance the cost of the ticket is 500 rupees.");
		System.out.println("Enter number of persons are travelling");
		//Enter the number that travelling
		int prsns=reader.nextInt();
		System.out.println("Enter Each passenger details: ");
		//Created ArrayList for to store Passenger Details
		ArrayList<ArrayList<String>> pssngrList=new ArrayList();
		//Due to Scanner Skipping issue, Just created
		reader.nextLine();
		for(int i=0;i<prsns;i++){
		    System.out.println("Enter Name and age: ");
		    ArrayList<String> psngrDet=new ArrayList();
		    String name1=reader.nextLine();
		    String age1=reader.nextLine();
		    psngrDet.add(name1);
		    psngrDet.add(age1);
		    pssngrList.add(psngrDet);
		}
		//Showing Passenger Name and age and discount;
		BusBooking m=new BusBooking();
		for(int a=0;a<prsns;a++){
		        String nameS=pssngrList.get(a).get(0);
		        String ageS=pssngrList.get(a).get(1);
		        m.prsnDetailsConfirmation(nameS,ageS);
		}
		
		
		//billing
		int ageAmount=0;
		
		for(int k=0;k<prsns;k++){
		    int tmpCl=0;
		    int nrmAge=Integer.parseInt(pssngrList.get(k).get(1));
		    if(nrmAge>5 && nrmAge < 65){
		        ageAmount+=500;
		    }else if(nrmAge>=65){
		        tmpCl=500/10;
		        ageAmount+=tmpCl*7;
		    }else{
		        ageAmount+=0;
		    }
		}
		System.out.println("Amount for the Journey is: "+ageAmount);
		
	}
}
