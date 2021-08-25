package operators;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int b = s.nextInt();
	    int e = s.nextInt();
	    double pn = Math.pow(b,e);
	    System.out.printf("%.0f",pn);
	}
}
