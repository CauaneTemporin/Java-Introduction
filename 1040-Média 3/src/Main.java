import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		double media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10 ;
		
		if(media>=5.00 || media<=6.9) {
			double exame = sc.nextDouble();
			double nota_final = (exame + media)/2;
			System.out.println("Media: " + media);
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+ exame);
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: "+ nota_final); 
		}
		else if(media >=7.00) {
			System.out.println("Media: "+ media);
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Media: "+ media);
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
	}
}