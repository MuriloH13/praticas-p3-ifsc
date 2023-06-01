package ifsc;

public class Animal {
	
	private String nome;
	private String raca;
	private String cor;
	private String eco;
	private Integer Npatas;
	private Float comprimento;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getEco() {
		return eco;
	}
	public void setEco(String eco) {
		this.eco = eco;
	}
	public Integer getNpatas() {
		return Npatas;
	}
	public void setNpatas(Integer npatas) {
		Npatas = npatas;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

}
