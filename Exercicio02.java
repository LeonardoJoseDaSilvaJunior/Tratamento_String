package Tratamento_String;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira uma frase para ser contabilizada: ");
		StringTokenizer frase = new StringTokenizer(scan.nextLine());
		System.out.println(frase.countTokens());
	}

}
