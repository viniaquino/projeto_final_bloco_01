package veiculo.repository;

import veiculo.model.Veiculo;

public interface VeiculoRepository {
	
	Veiculo procurarPorID(int id);
	public void listarVeiculos();
	public void cadastrar(Veiculo veiculo);
	public void atualizar(Veiculo veiculo);
	public void deletar(int id);
	
	public void vender(int idVeiculo, boolean disponivel);
}
