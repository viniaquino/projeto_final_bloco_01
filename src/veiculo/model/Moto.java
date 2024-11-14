package veiculo.model;

public class Moto extends Veiculo {
	
	private int tipoMoto;
	
	public Moto(int tipoVeiculo, String nome, int idVeiculo, String marca, int ano, String cor, String placa,
			float preco, boolean disponivel, int tipoMoto) {
		super(tipoVeiculo, nome, idVeiculo, marca, ano, cor, placa, preco, disponivel);
		this.tipoMoto = tipoMoto;
	}

	public int getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(int tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
	
}
