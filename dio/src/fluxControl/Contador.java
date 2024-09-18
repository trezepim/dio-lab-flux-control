package fluxControl;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int param1 = 0;
		int param2 = 0;
		int cont = 0;
		
		System.out.println("Informe o parâmetro um: ");
		param1 = sc.nextInt();
		
		System.out.println("Informe o parâmetro dois: ");
		param2 = sc.nextInt();
		
        try {
        	if (param1 > param2) {
        		throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
           cont = param2 - param1;
            
    		for(int i = 1; i <= cont; i++) {
    		System.out.println("Imprimindo o número " + i);
            }
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
		
		sc.close();
	}
}
