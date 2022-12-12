import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int codigo1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int codigo2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double valor_compra = (quantidade1*valor1)+(quantidade2*valor2);
		
		Locale.setDefault(Locale.US);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n" ,valor_compra);
		
		sc.close();
	}

}