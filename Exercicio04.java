package Tratamento_String;
import java.util.Scanner;
//Crie um algorito que exiba o texto inserido em letras minúsculas
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String texto;
		
		System.out.print("Insira o texto: ");
		texto = scan.nextLine();
		
		System.out.println(texto.toLowerCase());
	}

}
