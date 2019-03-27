package exercicio1;
import java.util.Scanner;

public class Calculadora {
	
	public static void somar(float a, float b) {
		System.out.println("O resultado de " + a + " + " + b + " eh: " + (a+b));
	}
	
	public static void subtrair(float a, float b) {
		System.out.println("O resultado de " + a + " - " + b + " eh: " + (a-b));
	}
	
	public static void dividir(float a, float b) {
		System.out.println("O resultado de " + a + " / " + b + " eh: " + (a/b));
	}
	
	public static void multiplicar(float a, float b) {
		System.out.println("O resultado de " + a + " * " + b + " eh: " + (a*b));
	}
	
	public static void main (String[] args) {
		float a;
		float b;
		char operacao;
		
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		Scanner op = new Scanner(System.in);
		
		System.out.println("Adicione o primeiro numero: ");
		a = num1.nextFloat();
		
		System.out.println("Adicione o segundo numero: ");
		b = num2.nextFloat();
		
		System.out.println("Digite qual operação deseja realizar: + (soma), - (subtracao), * (multiplicacao), / (divisao)");
		operacao = op.next().charAt(0);
		
		if (operacao == '+') {
			somar(a, b);
		}
		
		else if (operacao == '-') {
			subtrair(a, b);
		}
		
		else if (operacao == '*') {
			multiplicar(a, b);
		}
		
		else if (operacao == '/') {
			dividir(a, b);
		}
	}
}
