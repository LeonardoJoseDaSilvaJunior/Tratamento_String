package Tratamento_String;
import java.util.Scanner;
// faça um algoritmo que retire os espaços do inicio e fim das frases inseridas
public class Exercicio01 {
	public static void main(String []args) {
		Scanner scan = new Scanner (System.in);
		String frase;
		System.out.println("Insira uma frase: ");
		frase = scan.nextLine();
		System.out.println(frase.trim());
	}
}
