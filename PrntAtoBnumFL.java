//Print a to b numbers using for loop
import java.util.Scanner;
public class PrntAtoBnumFL
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		for(int i=a;i<=b;i++){
		    System.out.println(i);
		}
	}
}
