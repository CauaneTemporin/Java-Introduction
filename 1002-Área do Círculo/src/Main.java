import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area; 
		
		area = (pi * Math.pow(raio, 2));
		Locale.setDefault(Locale.US);
		System.out.printf("A=%.4f\n", area);
		
		sc.close();
	}
}