package ifsc;

public class Veiculo {
	
	private String Nome;
	private Integer Ano;
	private Integer NrRodas;
	private String Fabricante;
	private String Cor;
	
	public Integer getNrRodas() {
		return NrRodas;
	}
	public void setNrRodas(Integer nrRodas) {
		this.NrRodas = nrRodas;
	}
	public String getFabricante() {
		return Fabricante;
	}
	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Integer getAno() {
		return Ano;
	}
	public void setAno(Integer ano) {
		Ano = ano;
	}

}
