import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//Saída
//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, 
//com um espaço em branco antes e depois da igualdade.
		
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	int A;
	int B;
	int C;
	int D;
	int diferenca;
	
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	
	diferenca = (A * B - C * D);
	System.out.println("DIFERENCA = "+diferenca);
	
	sc.close();
	}

}
