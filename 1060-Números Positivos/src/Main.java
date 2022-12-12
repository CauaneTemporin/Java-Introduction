import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int valor = 0;	
		
		for(double numero=0; numero<6; numero++ ) {
			double num_novo = sc.nextDouble();
			if(num_novo>=1) {
				valor++;
			}
		}
		System.out.println(valor+" valores positivos");
		
		sc.close();
		
	}

}
