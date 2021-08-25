package operators;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("FIRST NUM:");
        int a=sc.nextInt();
        System.out.println("SECOND NUM:");
        int b=sc.nextInt();
        int c;
         c=a;
         a=b;
         b=c;
        System.out.println("After swap a:"+a);
        System.out.println("After swap b:"+b);
	}

}
