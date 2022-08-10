//write a program to print alternative even numbers from 20 to 140
import java.util.Scanner;
public class AltrnEvenFrm20To140
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		System.out.printf("Alternative Even Numbers are available Between %d and %d is: ",a,b);
		int count=0;
		for(int i=a;i<=b;i++){
		  if(i%2==0){
		      count++;
		      if(count%2!=0){
		          System.out.print(i+", ");
		      }
		  }  
		}
	}
}
