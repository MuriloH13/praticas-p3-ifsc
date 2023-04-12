package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo Carro = new Veiculo();

		Carro.setNome("Corsa");
		Carro.setCor("Preto");
		Carro.setAno(2019);

	System.out.println("O carro é um: " +Carro.getNome());
	System.out.println(Carro.getCor());
	System.out.println("modelo " +Carro.getAno());
	}
}
