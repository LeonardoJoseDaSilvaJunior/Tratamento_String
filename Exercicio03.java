package Tratamento_String;
// faça um algoritmo que compare dois textos, com o intuito de saber se ambos são iguais 
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String primeiroTexto, segundoTexto;
		
		System.out.println("Insira um texto: ");
		primeiroTexto = scan.nextLine();
		System.out.println("Insira o texto que será comparado");
		segundoTexto = scan.nextLine();
		System.out.println(primeiroTexto.equalsIgnoreCase(segundoTexto) ? "Iguais" : "Diferentes");
	}
}
