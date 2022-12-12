import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double operacao = Math.pow(B, 2)-(4*A*C);
		double R1 = (-B + Math.sqrt(operacao))/(2*A);
		double R2 = (-B - Math.sqrt(operacao))/(2*A);
		
		if(operacao>0 && A!=0) {
			System.out.printf("R1 = %.5f\n",R1);
			System.out.printf("R2 = %.5f\n",R2);
		}
		else {
		System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}
}