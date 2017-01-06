import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			int maiorCicloAteEntao = 1;
			for (int atual = Math.min(i, j); atual <= Math.max(i, j); atual++) {
				int resultado = calculaPara(atual);
				if (resultado > maiorCicloAteEntao)
					maiorCicloAteEntao = resultado;

			}
			System.out.println(i + " " + j + " " + maiorCicloAteEntao);

		}
	}

	private static int calculaPara(int atual) {

		int operacoes = 1;
		while (atual != 1) {
			if (atual % 2 == 0)
				atual = atual / 2;
			else
				atual = atual * 3 + 1;
			operacoes++;
		}
		return operacoes;
	}

}
