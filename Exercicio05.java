package Tratamento_String;
//Faça um algoritmo que receba 4 palavras e as insira em um array, logo depois as exiba em miúscula
import java.util.Scanner;
public class Exercicio05 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		String [] palavras = new String [4];
		for (int i = 0; i < palavras.length;i++) {
			System.out.print("insira a " + i + "º palavra");
			palavras[i] = scan.nextLine();
		}
		for(String i:palavras) {
			System.out.print(i.toUpperCase()+ " ");
		}
	}
}
