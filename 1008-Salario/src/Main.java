import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int num = sc.nextInt();
		int hora_trab = sc.nextInt();
		double valor_hora = sc.nextDouble();
		double salario = hora_trab * valor_hora;
		
		System.out.println("NUMBER = " + num);
		Locale.setDefault(Locale.US);
		System.out.printf("SALARY = U$ %.2f\n", salario);
			
		sc.close();
	}

}