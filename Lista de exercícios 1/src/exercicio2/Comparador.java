package exercicio2;
import java.util.Scanner;

public class Comparador {
	public int num1;
	public int num2;
	public int num3;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	public static void getMaior(int a, int b, int c) {
		if (a> b && a>c) {
			System.out.println("O maior valor eh: " + a);
		}
		else if (b> a && b>c) {
			System.out.println("O maior valor eh: " + b);
		}
		else if (c> a && c>b) {
			System.out.println("O maior valor eh: " + c);
		}
	}
	
	public static void main(String[] args) {
		int a, b, c;
		
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = n1.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = n2.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = n3.nextInt();
		
		getMaior(a, b, c);
	}
}
