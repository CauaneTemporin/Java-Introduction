import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int x;
		double y;
		double distancia;
		
		x = sc.nextInt();
		y = sc.nextDouble();
		
		distancia = x/y;
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%s%n",distancia ," km/l");
		
		sc.close();

	}

}
