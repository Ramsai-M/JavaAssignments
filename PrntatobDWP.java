//Print a to b numbers using do while loop
import java.util.Scanner;
public class PrntatobDWP
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		int i=a;
		do{
		    System.out.println(i);
		    i++;
		}while(i<=b);
	}
}
