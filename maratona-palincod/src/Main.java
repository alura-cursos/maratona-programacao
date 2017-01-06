import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = Integer.parseInt(sc.nextLine());
		for(int i=1;i<=numero;i++) {
			System.out.print(i + " ");
			
			String frase = sc.nextLine();
			String invertido = new StringBuilder(frase).reverse().toString();
			if(frase.equals(invertido)) {
				System.out.println("\"YES\"");
			} else {
				System.out.println("\"NO\"");
			}
//			System.out.println(frase);
		}
	}

}
