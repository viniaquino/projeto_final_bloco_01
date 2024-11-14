package veiculo.model;

public class Moto extends Veiculo {
	
	private String tipoMoto;
	
	public Moto(int tipoVeiculo, String nome, int idVeiculo, String marca, int ano, String cor, String placa,
			float preco, boolean disponivel, String tipoMoto) {
		super(tipoVeiculo, nome, idVeiculo, marca, ano, cor, placa, preco, disponivel);
		this.tipoMoto = tipoMoto;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}
	
}
