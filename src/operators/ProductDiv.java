package operators;
import java.util.Scanner;
public class ProductDiv {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("FIRST INTEGER:");
        int a=sc.nextInt();
        System.out.println("SECOND INTEGER:");
        int b=sc.nextInt();
        int c=a*b;
        int d=a/b;
        int e=a%b;
        System.out.println("Product is:"+c);
        System.out.println("Quotient is:"+d);
        System.out.println("Remainder is:"+e);
        
	}

}

