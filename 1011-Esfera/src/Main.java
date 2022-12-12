import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = ((4.0/3) * pi * Math.pow(raio, 3));
		
		Locale.setDefault(Locale.US);
		System.out.printf("VOLUME = %.3f\n", area);
		sc.close();
		
	}

}