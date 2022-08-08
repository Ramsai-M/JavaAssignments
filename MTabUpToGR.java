//Print 3 Multiples between Given Numbers
import java.util.Scanner;
public class MTabUpToGR
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		int count=1;
		for(int i=a;i<=b;i++){
		    int k=3;
		    if(i%3==0){
		        k=k*count;
		        System.out.print(k+" ");
		        count++;
		    }
		}
	}
}
