//Print a to b numbers using while loop
import java.util.Scanner;
public class PrntatobWP
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		int i=a;
		while(i<=b){
		    System.out.println(i);
		    i++;
		}
	}
}
