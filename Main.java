package Tratamento_String;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Main {
	static Scanner scan = new Scanner (System.in);
	public static void main (String[]args) {
		int opcoes;
		System.out.println("Digite a opção desejada\nOpções:\n1 - StringTokenizer\n2 - Metodos endWith e StartsWith\n3 - Metodo trim");
		opcoes = scan.nextInt();
		scan.nextLine();
		switch (opcoes) {
		case 1: {
			quantidadePalvras();
			break;
		}
		case 2:{
			endsStarts();
			break;
		}
		case 3:{
			executeTrim();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcoes);
		}
		
	}
	//Testando  a biblioteca StringTokenizer;

	public static void quantidadePalvras() {
		System.out.print("Insira a frase desejada: ");
		StringTokenizer palavras = new StringTokenizer(scan.nextLine());
		System.out.println("\nQuantidade de palavras: " + palavras.countTokens());		
	}
	// Metodos endsWith e startsWith;

	public static void endsStarts() {
		System.out.print("Insira a frase desejada: ");
		String valor = scan.next();
		System.out.println(valor.endsWith("\nString"));
		System.out.println(valor.startsWith("T"));
		System.out.println(valor.startsWith("mento",5));
	}
	// Metodo Trim 
	public static void executeTrim() {
	    String frase;
	    System.out.print("Insira a frase desejada: ");
	    frase = scan.nextLine();
	    System.out.println(frase.trim());
	    scan.close();
	}
}
