package ifsc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		
		Scanner Leitura = new Scanner(System.in);
		System.out.println("Nome:");
		String nome = Leitura.nextLine();
		
		System.out.println("Idade:");
		String idadestr = Leitura.nextLine();
		
		double idade = Double.valueOf(idadestr);
		
		System.out.println(nome + idade);


	}

}
