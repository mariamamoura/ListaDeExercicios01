package exercicio3;

import java.util.Scanner;

public class ConversorDeMedidas {

	public static void converterMassa(Medidas unidadeDeMassa, Medidas massa) {
		double kg;
		double lb;
		double aux;
		
		if (unidadeDeMassa.getUnidadeDeMassa().equalsIgnoreCase("kg") && massa.getUnidadeDeMassa().equalsIgnoreCase("lb")){
			
			aux = unidadeDeMassa.getMassa();
			lb = aux * 2.2046;
			System.out.println("%.2f lb" + lb);
		} else {
			if (unidadeDeMassa.getUnidadeDeMassa().equalsIgnoreCase("lb") && massa.getUnidadeDeMassa().equalsIgnoreCase("kg")) {
				aux = unidadeDeMassa.getMassa();
				kg = aux / 2.2046;
						System.out.println("%.2f kg" + kg);
			}else {
				System.out.println("Por favor, entre com valores diferentes.");
			}
		}
	}
	
	public static void converterTemperatura(Medidas unidadeDeTemperatura, Medidas temperatura) {
		double c;
		double f;
		double aux;
		
		if(unidadeDeTemperatura.getUnidadeDeTemperatura().equalsIgnoreCase("C") && temperatura.getUnidadeDeTemperatura().equalsIgnoreCase("F")) {
			aux = unidadeDeTemperatura.getTemperatura();
			f = aux * (1.8 + 32);
			System.out.println("%.2f F" + f);
		}else {
		if(unidadeDeTemperatura.getUnidadeDeTemperatura().equalsIgnoreCase("F") && temperatura.getUnidadeDeTemperatura().equalsIgnoreCase("C")) {
			aux = unidadeDeTemperatura.getTemperatura();
			c = (aux - 32) / 1.8;
			System.out.println("%.2f C" + c);
		}else {
			System.out.println("Por favor, entre com valores diferentes.");
			}
		}
	}
	
	public static void converterDistancia(Medidas unidadeDeDistancia, Medidas distancia) {
		double mi;
		double km;
		double aux;
		
		if (unidadeDeDistancia.getUnidadeDeDistancia().equalsIgnoreCase("km") && distancia.getUnidadeDeDistancia().equalsIgnoreCase("mi")) {
			aux = unidadeDeDistancia.getDistancia();
			mi = aux / 1.609;
			System.out.println("%.2f mi" + mi);
		}else {
		if (unidadeDeDistancia.getUnidadeDeDistancia().equalsIgnoreCase("mi") && distancia.getUnidadeDeDistancia().equalsIgnoreCase("km")) {
			aux = unidadeDeDistancia.getDistancia();
			km = aux * 1.609;
			System.out.println("%.2f km" + km);
		}else {
			System.out.println("Por favor, entre com valores diferentes.");
				}
			}
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double val1 = input.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double val2 = input.nextDouble();
		
		System.out.println("Voce deseja saber distancia(1), massa(2) ou temperatura(3)?");
		String escolha = input.nextLine();
		
		switch(escolha) {
		case "1":
			converterDistancia(val1, val2);
			break;
		case "2":
			converterMassa(val1, val2);
			break;
		case "3":
			converterTemperatura(val1, val2);
			break;
		default: System.out.println("Voce tem que digitar um numero entre 1, 2 ou 3");
		break;
		}
	}
	}
	
