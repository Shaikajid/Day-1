package operators;
import java.util.Scanner;
public class SumandDiff {
		public static void main(String[] args) 
		{
	           Scanner sc=new Scanner(System.in);
	           System.out.println("FIRST INTEGER:");
	           int a=sc.nextInt();
	           System.out.println("SECOND INTEGER:");
	           int b=sc.nextInt();
	           int c=a+b;
	           int d=a-b;
	           System.out.println("Sum is:"+c);
	           System.out.println("Diff is:"+d);
	           
		}

}
