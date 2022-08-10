//Write a program to print the count of the even numbers between the given Range
import java.util.Scanner;
public class EvenNumCntInGivenRange
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
		  if(i%2==0){
		      count++;
		  }  
		}
		System.out.printf("Even Numbers are available Between %d and %d is: %d ",a,b,count);
	}
}
