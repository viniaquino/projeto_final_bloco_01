package veiculo.controller;

import java.util.ArrayList;
import java.util.List;

import veiculo.exception.VeiculoVendidoException;
import veiculo.model.Veiculo;
import veiculo.repository.VeiculoRepository;

public class VeiculoController implements VeiculoRepository {
	
	private List<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
	private int idCounter = 1;
	
	@Override
	public Veiculo procurarPorID(int id) {
		for (var veiculo : listaVeiculos) {
			if (veiculo.getIdVeiculo() == id) {
				return veiculo;
			}
		}
		return null;
	}

	@Override
	public void listarVeiculos() {
	    if (listaVeiculos.isEmpty()) {
	        System.out.println("Nenhum veículo cadastrado.");
	    } else {
	        for (Veiculo veiculo : listaVeiculos) {
	            System.out.println("ID: " + veiculo.getIdVeiculo() + ", Nome: " + veiculo.getNome() + ", Marca: " + veiculo.getMarca() + ", Cor: " + veiculo.getCor() + ", Preço: " + veiculo.getPreco());
	        }
	    }
	}

	@Override
	public void cadastrar(Veiculo veiculo) {
		veiculo.setIdVeiculo(idCounter++);
		listaVeiculos.add(veiculo);
		System.out.println("\nO veículo: " + veiculo.getNome() + " com id: " + veiculo.getIdVeiculo() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Veiculo veiculo) {
		var buscaVeiculo = procurarPorID(veiculo.getIdVeiculo());
		
		if (buscaVeiculo != null) {
			listaVeiculos.set(listaVeiculos.indexOf(buscaVeiculo), veiculo);
			System.out.println("\nO Veículo de ID: " + veiculo.getIdVeiculo() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO veículo de ID: " + veiculo.getIdVeiculo() + " não foi encontrado!");
		}
	}

	@Override
	public void deletar(int id) {
        Veiculo veiculo = procurarPorID(id);
        if (veiculo != null) {
            listaVeiculos.remove(veiculo);
            System.out.println("Veículo removido com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }

	@Override
	public void vender(int id, boolean disponivel) throws VeiculoVendidoException {
        Veiculo veiculo = procurarPorID(id);
        if (veiculo != null) {
        	if (!veiculo.isDisponivel()) {
				throw new VeiculoVendidoException("O veículo com ID: " + id + " já foi vendido!");
			}
            veiculo.setDisponivel(false);
            listaVeiculos.remove(veiculo);
            System.out.println("Veículo vendido com sucesso!");
        } else {
            System.out.println("Veículo não encontrado!");
        }
    }
	
}
