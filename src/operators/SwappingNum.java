package operators;
import java.util.Scanner;
public class SwappingNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("FIRST NUM:");
        int a=sc.nextInt();
        System.out.println("SECOND NUM:");
        int b=sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("After swaping a:"+a);
        System.out.println("After swaping b:"+b);


	}

}
