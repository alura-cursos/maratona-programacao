import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		for (int i = 1; i <= t; i++) {
			String p = s.nextLine();
			System.out.println(i + (new StringBuilder(p).reverse().toString().equals(p) ? " \"YES\"" : " \"NO\""));
		}
	}
}