import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o parâmetro um: ");
		int param1 = sc.nextInt();

		System.out.println("Informe o parâmetro dois: ");
		int param2 = sc.nextInt();

		try {
			if (param1 > param2) {
				throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
			}
			int cont = param2 - param1;

			for(int i = 1; i <= cont; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
