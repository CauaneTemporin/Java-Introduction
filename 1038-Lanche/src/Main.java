import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if(codigo == 1) {
			double valor = 4.00*quantidade;
			System.out.printf("Total: R$ %.2f\n" ,valor);
		}
		else if(codigo == 2) {
			double valor = 4.50*quantidade;
			System.out.printf("Total: R$ %.2f\n" ,valor);
		}
		else if(codigo == 3) {
			double valor = 5.00*quantidade;
			System.out.printf("Total: R$ %.2f\n" ,valor);
		}
        else if(codigo == 4) {
			double valor = 2.00*quantidade;
			System.out.printf("Total: R$ %.2f\n" ,valor);
		}
		else {
			double valor = 1.50*quantidade;
			System.out.printf("Total: R$ %.2f\n" ,valor);
		}
		
		sc.close();
	}
}