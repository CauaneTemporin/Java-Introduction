import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double a;
		double b;
		double media;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		media = ((a*3.5)+(b*7.5))/11;
		Locale.setDefault(Locale.US);
		System.out.printf("MEDIA = %.5f%n",media);
		
		sc.close();		
		}
}