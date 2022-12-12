import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont_num =0;
		double media = 0;
		
		for(int i = 0; i < 6; i++) {
			double num = sc.nextDouble();
			if (num >= 0) {
				cont_num++;
				media += num;
			}
		}
		System.out.println(cont_num +" valores positivos");
		System.out.println(media/cont_num);
		sc.close();
  
	}
}