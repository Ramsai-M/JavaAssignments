//Write a program to print all odd numbers from 251 to 51 like (251,249,...51)
import java.util.Scanner;
public class Oddnum251t051
{
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		System.out.printf("Odd Numbers Between %d and %d is: ",a,b);
		for(int i=a;i>=b;i--){
		  if(i%2!=0){
		      System.out.print(i+" ");
		  }  
		}
	}
}
