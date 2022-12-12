import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double horas = sc.nextDouble();
		double km = sc.nextDouble();
		double litros_gasto = (km/12)*horas;
		
		System.out.printf("%.3f\n" , litros_gasto);
		
		sc.close();
	}
}