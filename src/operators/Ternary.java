package operators;
import java.util.Scanner;
public class Ternary {
	    public static void main(String[] args) {
	    		Scanner scan = new Scanner(System.in);
	    		int number = scan.nextInt();
	    		scan.close();
	    		String result = number%2==0 ? "Even" : "Odd";
	    		System.out.println(result);
	    }
	}

