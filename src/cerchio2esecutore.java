import java.util.Scanner;
public class cerchio2esecutore {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("inserire r1: ");
		double r1 = in.nextInt();
		System.out.print("inserire r2: ");
		double r2 = in.nextInt();
		
		cerchio c1 = new cerchio(r1);
		cerchio c2 = new cerchio(r2);
		
		System.out.println(c1);
		System.out.println(c2);
		}
	}


