package exercicio5;
import java.util.Scanner;

public class ComparadorDeStrings {
	
	public static void Comparador(String a, String b){
		String reversa = "";
		
		for (int i = b.length()-1; i>=0; i--) {
			reversa += b.charAt(i);
		}
		
		if (a.equalsIgnoreCase(reversa)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		String palavra1;
		String palavra2;
		
		System.out.println("Digite a primeira palavra: ");
		Scanner pal1 = new Scanner(System.in);
		palavra1 = pal1.nextLine();
		
		System.out.println("Digite a segunda palavra: ");
		Scanner pal2 = new Scanner(System.in);
		palavra2 = pal2.nextLine();
		
		
		Comparador(palavra1, palavra2);
	}

}
