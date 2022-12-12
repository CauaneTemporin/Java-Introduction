import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
    	String nome = sc.next();
		double salario_fixo = sc.nextDouble();
		double venda = sc.nextDouble();
		double salario_final = salario_fixo + (venda*0.15);
		Locale.setDefault(Locale.US);
		System.out.printf("TOTAL = R$ %.2f\n" , salario_final);
		
		sc.close();
	}

}