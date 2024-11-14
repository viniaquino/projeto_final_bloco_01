package veiculo.model;

public class Carro extends Veiculo {

	private int numeroPortas;
	private String cambio;
	
	public Carro(int tipoVeiculo, String nome, int idVeiculo, String marca, int ano, String cor, String placa,
			float preco, boolean disponivel, int numeroPortas, String cambio) {
		super(tipoVeiculo, nome, idVeiculo, marca, ano, cor, placa, preco, disponivel);
		this.numeroPortas = numeroPortas;
		this.cambio = cambio;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	
}
