package Ex9;

public class PessoaMainA {
	
	public static void main(String[] args) {
		
		Pessoa eu = new Pessoa();
		eu.nome = "Murilo";
		eu.cpf = 7914661910l;
		eu.nas = "08/10/2005";
		
		System.out.println("A pessoa " + eu.nome + ", Tem o cpf " + eu.cpf + " E a data de nascimento " + eu.nas);
	}

}
