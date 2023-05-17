package Ex11;

import java.util.Scanner;

public class PessoaMainB {
	
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Pessoa[] vet = new Pessoa[3];
		
		for (int i = 0; i < 3; i++) {
			Pessoa tu = new Pessoa();
			tu.nome = leitura.nextLine();
			tu.cpf = leitura.nextLine();
			tu.datnas = leitura.nextLine();
			vet[i] = tu;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("A pessoa " + vet[i].nome + " Tem o cpf " + vet[i].cpf +
								"E tem a data de nascimento de:" + vet[i].datnas);
		}
	}

}
