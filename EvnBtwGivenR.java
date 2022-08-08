//Write a program to print all even numbers in range 700 to 900
import java.util.Scanner;
public class EvnBtwGivenR
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		System.out.printf("Even Numbers Between %d and %d is: ",a,b);
		for(int i=a;i<=b;i++){
		  if(i%2==0){
		      System.out.print(i+" ");
		  }  
		}
	}
}
