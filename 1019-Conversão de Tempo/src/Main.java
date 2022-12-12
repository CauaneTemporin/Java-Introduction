import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int numero_horas = numero/3600;
		int numero_minuto = (numero%3600 )/60;
		int numero_segundo = (numero%3600 )%60;
		
		System.out.println(numero_horas+":"+numero_minuto+":"+numero_segundo);
		
		sc.close();

	}

}