package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro valor:");
			int a = sc.nextInt();
			
			System.out.println("Digite o segundo valor:");
			int b = sc.nextInt();
			
			int soma = soma(a, b);
			int subtracao = subtração(a, b);
			int divisao = divisao(a, b);
			int multiplicacao = multiplicacao(a, b);
			
			System.out.println(soma);
			System.out.println(subtracao);
			System.out.println(divisao);
			System.out.println(multiplicacao);
		}
	}

	public static int soma(int a,  int b) {
		return a + b;
		
	}
	public static int subtração(int a,  int b) {
		return a - b;
		
	}
	public static int divisao(int a,  int b) {
		return a / b;
		
	}
	public static int multiplicacao(int a,  int b) {
		return a * b;
		
	}
	
}
