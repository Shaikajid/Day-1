package operators;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Float a = sc.nextFloat();
	    Float b = sc.nextFloat();
	    Float c = sc.nextFloat();
	    Float d = sc.nextFloat();
	    Float e = sc.nextFloat();
	    Float t = (a+b+c+d+e);
	    System.out.printf("%.2f",t/5);
	}
}

