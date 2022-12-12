import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distanciax = Math.pow((x2 - x1), 2);
		double distanciay = Math.pow((y2 - y1), 2);
		double distancia = Math.sqrt((distanciax + distanciay));
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n" , distancia);
		sc.close();
	}

}