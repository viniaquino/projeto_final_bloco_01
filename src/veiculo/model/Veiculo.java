package veiculo.model;

public abstract class Veiculo {

	private int tipoVeiculo;
	private String nome;
	private int idVeiculo;
	private String marca;
	private int ano;
	private String cor;
	private String placa;
	private float preco;
	private boolean disponivel = true;

	public Veiculo(int tipoVeiculo, String nome, int idVeiculo, String marca, int ano, String cor, String placa,
			float preco, boolean disponivel) {
		this.tipoVeiculo = tipoVeiculo;
		this.nome = nome;
		this.idVeiculo = idVeiculo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
		this.preco = preco;
		this.disponivel = disponivel;
	}

	public int getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(int tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String vender() {
		if (disponivel) {
			disponivel = false;
			return "Veículo " + nome + " (ID: " + idVeiculo + ") vendido com sucesso!";
		} else {
			return "Veículo " + nome + " (ID: " + idVeiculo + ") indisponível no momento!" ;
		}
	}
	
	public void visualizar() {
		String tipoVeiculo = "";
		
		switch (this.tipoVeiculo) {
		case 1:
			tipoVeiculo = "Carro";
			break;
			
		case 2:
			tipoVeiculo = "Moto";
			break;
		}
		
		System.out.println("\n\n**********************************************************");
		System.out.println("Dados do Veículo:");
		System.out.println("**********************************************************");
		System.out.println("Tipo do Veículo: " + this.tipoVeiculo);
		System.out.println("Nome do Veículo: " + this.nome);
		System.out.println("ID do Veículo: " + this.idVeiculo);
		System.out.println("Marca do Veículo: " + this.marca);
		System.out.println("Ano do Veículo: " + this.ano);
		System.out.println("Cor do Veículo: " + this.cor);
		System.out.println("Placa do Veículo: " + this.placa);
		System.out.println("Preço do Veículo: " + this.preco);
		System.out.println("Disponibilidade: " + this.disponivel);
	}

}
