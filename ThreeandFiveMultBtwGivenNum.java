//Print 3 and 5 Multiples between Given Numbers
import java.util.Scanner;
public class ThreeandFiveMultBtwGivenNum
{
    public static void number(int a,int b,int k){
	    int count=1;
	    //int d=0;
		for(int i=a;i<=b;i++){
		    int e=k;
		    if(i%k==0){
		        e=e*count;
		        System.out.print(e+" ");
		        count++;
		    }
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
	    Scanner reader=new Scanner(System.in);
	    System.out.println("Enter the Starting Number");
		int a=reader.nextInt();
		System.out.println("Enter the Ending Number");
		int b=reader.nextInt();
		Main.number(a,b,3);
		Main.number(a,b,5);
	}
}
