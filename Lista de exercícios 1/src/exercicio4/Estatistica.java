package exercicio4;
import java.util.Scanner;
import java.lang.Math;

public class Estatistica {
	public int maiorValor;
	
	public static void Somatorio(int maiorValor) {
		//inclui o maiorValor na conta do somatório
		int i;
		int soma = 0;
		
		for(i=0; i<= maiorValor; i++)
			soma += i;
		
		System.out.println("A soma de todos os valores ate " + maiorValor + " eh: " + soma);
	}
	
	public static void Media(int maiorValor) {
		int i = 0;
		int soma = 0;
		float media = 0;
		
		do {
			i++;
			maiorValor--;
			soma += i;
		} while (maiorValor > 0);
		 media = (soma / i);
		
		System.out.println("A media dos numeros ate " + i + " eh: " + media);
	}
	
	public static void Variancia(int maiorValor) {
		int i;
		int soma = 0;
		int aux = maiorValor;
		float media = 0;
		double variancia = 0;
		double numerador = 0;
		
		for(i=0; i<= maiorValor; i++) 
			soma += i;
		 media = soma / maiorValor;
		 
		 while(aux>=0) {
			 i++;
			 aux--;
		 }
		 
		 for (int j = 0; j<= maiorValor; i++) {
			 numerador += Math.pow((j - media), 2);
		 }
		 
		 variancia = Math.sqrt(numerador/i);
		 System.out.println("A variancia dos numeros ate " + maiorValor + " eh: " + variancia);
	}
	
	public static void Imprimir(int maiorValor) {
		int i;
		for (i=0; i<= maiorValor; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " eh par");
			}
			else {
				System.out.println(i + " eh impar");
			}
		}
	}
	
	public static void main(String[] args) {
		int a;
		System.out.println("Digite um numero: ");
		Scanner valor = new Scanner(System.in);		
		a = valor.nextInt();
		
		Somatorio(a);
		Media(a);
		Imprimir(a);
		Variancia(a); //Não consigo imprimir o resultado. Por isso deixei por ultimo
	}
}
