import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		calculaPara(1);
//		calculaPara(22);
//		calculaPara(999999);
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			int maiorCicloAteAgora = 1;
			for(int atual = Math.min(i, j); atual <= Math.max(i, j); atual++) {
				int resultado = calculaPara(atual);
				if(resultado > maiorCicloAteAgora) {
					maiorCicloAteAgora = resultado;
				}
			}
			
			System.out.println(i + " " + j + " " + maiorCicloAteAgora);
		}
	}

	private static int calculaPara(int n) {
		int impressos = 1;
//		System.out.println(n);
		while(n != 1) {
			if(n % 2 == 1) n = n * 3 + 1;
			else n = n / 2;
			impressos++;
//			System.out.println(n);
		}
		return impressos;
	}

}







