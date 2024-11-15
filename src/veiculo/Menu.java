package veiculo;

import java.util.InputMismatchException;
import java.util.Scanner;
import veiculo.controller.VeiculoController;
import veiculo.exception.VeiculoVendidoException;
import veiculo.model.Carro;
import veiculo.model.Moto;
import veiculo.model.Veiculo;

public class Menu {
	
	public static void main(String[] args) {
		
		VeiculoController veiculos = new VeiculoController();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao, tipoVeiculo, idVeiculo, ano;
		String nome, marca, cor = "", placa;
		float preco;
		boolean disponivel = true;
		
		while (true) {
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("                  Motors & Cia                        ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("             1 - Cadastrar Veículo                    ");
			System.out.println("             2 - Listar todos os Veículo              ");
			System.out.println("             3 - Buscar Veículo por ID                ");
			System.out.println("             4 - Atualizar Dados do Veículo           ");
			System.out.println("             5 - Excluir Veículo                      ");
			System.out.println("             6 - Vender Veículo                       ");
			System.out.println("             7 - Sair                                 ");
			System.out.println("                                                      ");
			System.out.println("******************************************************");
			System.out.println("                                                      ");
			System.out.println("Digite a opção desejada:                              ");
			
			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				scanner.nextLine();
				opcao = 0;
			}
			
			if (opcao == 7) {
				System.out.println("\nMotors & Cia - Acelere seus sonhos conosco!");
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Veículo\n\n");
				
				do {
			        System.out.println("Digite o tipo do veículo (1-Carro ou 2-Moto): ");
			        tipoVeiculo = scanner.nextInt();
			    } while (tipoVeiculo < 1 || tipoVeiculo > 2);

			    scanner.skip("\\R?");
			    
			    System.out.println("Digite o nome do veículo: ");
			    nome = scanner.nextLine();
			    System.out.println("Digite a marca do veículo: ");
			    marca = scanner.nextLine();
			    System.out.println("Digite a cor do Veículo: ");
			    cor = scanner.nextLine();
			    System.out.println("Digite o ano de fabricação do veículo: ");
			    ano = scanner.nextInt();
			    scanner.skip("\\R?");
			    System.out.println("Digite a placa do veículo: ");
			    placa = scanner.nextLine();
			    System.out.println("Digite o preço do veículo: ");
			    preco = scanner.nextFloat();
			    scanner.skip("\\R?");

			    if (preco <= 0) {
			        System.out.println("Preço inválido! O preço informado não pode ser negativo!");
			    }

			    Veiculo veiculo = null;

			    if (tipoVeiculo == 1) {
			        int numeroPortas;
			        String cambio;
			        
			        System.out.println("Digite o número de portas do carro: ");
			        numeroPortas = scanner.nextInt();
			        scanner.skip("\\R?");
			        
			        System.out.println("Digite o tipo de câmbio do carro (Manual ou Automático): ");
			        cambio = scanner.nextLine();
			        
			        veiculo = new Carro(tipoVeiculo, nome, 0, marca, ano, cor, placa, preco, disponivel, numeroPortas, cambio);
			    } else if (tipoVeiculo == 2) {
			        String tipoMoto;
			        
			        System.out.println("Digite o tipo da moto (Estrada ou Comum): ");
			        tipoMoto = scanner.nextLine().toLowerCase();
			        
			        veiculo = new Moto(tipoVeiculo, nome, 0, marca, ano, cor, placa, preco, disponivel, tipoMoto);
			    }
			    
			    veiculos.cadastrar(veiculo);
			    keyPress();
				break;
				
			case 2:
				System.out.println("Listar todos os Veículos\n\n");
				veiculos.listarVeiculos();
				keyPress();
				break;
				
			case 3:
				System.out.println("Consultar dados do Veículo - por ID\n\n");
				
				System.out.println("Digite o ID do Veículo: ");
				idVeiculo = scanner.nextInt();
				
				Veiculo veiculoSelecionado = veiculos.procurarPorID(idVeiculo);
				
				if (veiculoSelecionado != null) {
			        System.out.println("\nVeículo selecionado:");
			        System.out.println("ID: " + veiculoSelecionado.getIdVeiculo());
			        System.out.println("Nome: " + veiculoSelecionado.getNome());
			        System.out.println("Marca: " + veiculoSelecionado.getMarca());
			        System.out.println("Ano: " + veiculoSelecionado.getAno());
			        System.out.println("Cor: " + veiculoSelecionado.getCor());
			        System.out.println("Placa: " + veiculoSelecionado.getPlaca());
			        System.out.println("Preço: " + veiculoSelecionado.getPreco());
			        System.out.println("Disponível: " + (veiculoSelecionado.isDisponivel() ? "Sim" : "Não"));
			        
			        if (veiculoSelecionado instanceof Carro) {
			            Carro carro = (Carro) veiculoSelecionado;
			            System.out.println("Número de portas: " + carro.getNumeroPortas());
			            System.out.println("Câmbio: " + carro.getCambio());
			        } else if (veiculoSelecionado instanceof Moto) {
			            Moto moto = (Moto) veiculoSelecionado;
			            System.out.println("Tipo de moto: " + moto.getTipoMoto());
			        }
			    } else {
			        System.out.println("Veículo não encontrado com o ID: " + idVeiculo);
			    }
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar dados de um Veículo\n\n");
				
				System.out.println("Digite o ID do véiculo: ");
				idVeiculo = scanner.nextInt();
				
				var buscaVeiculo = veiculos.procurarPorID(idVeiculo);
				
				if (buscaVeiculo != null) {
					System.out.println("Veículo selecionado: ");
					System.out.println("Nome: " + buscaVeiculo.getNome());
				    System.out.println("Marca: " + buscaVeiculo.getMarca());
				    System.out.println("Ano: " + buscaVeiculo.getAno());
				    System.out.println("Cor: " + buscaVeiculo.getCor());
				    System.out.println("Placa: " + buscaVeiculo.getPlaca());
				    System.out.println("Preço: " + buscaVeiculo.getPreco());
				    
				    System.out.println("\nInforme os novos dados para atualizar o veículo");
				    
				    System.out.println("\nDigite o novo nome do veículo (atualmente: " + buscaVeiculo.getNome() + "): ");
				    scanner.nextLine();
				    String novoNome = scanner.nextLine();
				    if (!novoNome.isEmpty()) {
				        buscaVeiculo.setNome(novoNome);
				    }
				    
				    System.out.println("Digite a nova marca do veículo (atualmente: " + buscaVeiculo.getMarca() + "): ");
				    String novaMarca = scanner.nextLine();
				    if (!novaMarca.isEmpty()) {
				        buscaVeiculo.setMarca(novaMarca);
				    }
				    
				    System.out.println("Digite a nova cor do veículo (atualmente: " + buscaVeiculo.getCor() + "): ");
				    String novaCor = scanner.nextLine();
				    if (!novaCor.isEmpty()) {
				        buscaVeiculo.setCor(novaCor);
				    }
				    
				    System.out.println("Digite o novo preço do veículo (atualmente: " + buscaVeiculo.getPreco() + "): ");
				    float novoPreco = scanner.nextFloat();
				    if (novoPreco >= 0) {
				        buscaVeiculo.setPreco(novoPreco);
				    }
				    
				    if (buscaVeiculo instanceof Carro) {
				        Carro carro = (Carro) buscaVeiculo;
				        System.out.println("Digite o novo número de portas do veículo (atualmente: " + carro.getNumeroPortas() + "): ");
				        int novoNumeroPortas = scanner.nextInt();
				        if (novoNumeroPortas > 0) {
				            carro.setNumeroPortas(novoNumeroPortas);
				        }

				        System.out.println("Digite o novo tipo de câmbio do veículo (atualmente: " + carro.getCambio() + "): ");
				        scanner.nextLine(); 
				        String novoCambio = scanner.nextLine();
				        if (!novoCambio.isEmpty()) {
				            carro.setCambio(novoCambio);
				        }
				        
				        if (buscaVeiculo instanceof Moto) {
				            Moto moto = (Moto) buscaVeiculo;
				            System.out.println("Digite o novo tipo de moto (estrada/comum) (atualmente: " + moto.getTipoMoto() + "): ");
				            String novoTipoMoto = scanner.nextLine();
				            if (!novoTipoMoto.isEmpty()) {
				                moto.setTipoMoto(novoTipoMoto);
				            }
				        }
				        
				        veiculos.atualizar(buscaVeiculo);
				    } else {
				    	System.out.println("Veículo não encontrado com o ID: " + idVeiculo);
				    }
				}
				keyPress();
				break;
				
			case 5:
				System.out.println("Apagar Veículo\n\n");
				
				System.out.println("Digite o ID do Veículo: ");
				idVeiculo = scanner.nextInt();
				
				veiculos.deletar(idVeiculo);
				keyPress();
				break;
				
			case 6:
				System.out.println("Vender um Veículo\n\n");
				
				System.out.println("Digite o ID do veículo que deseja vender: ");
				idVeiculo = scanner.nextInt();
				
				try {
					veiculos.vender(idVeiculo, disponivel);
				} catch (VeiculoVendidoException e) {
					System.err.println("Erro: " + e.getMessage());
				}
				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}
	
	public static void keyPress() {
	    System.out.println("\nPressione Enter para continuar...");
	    Scanner scanner = new Scanner(System.in);
	    scanner.nextLine();
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vinícius Aquino");
		System.out.println("Vinicius Aquino - contato.viniaquino@outlook.com");
		System.out.println("github.com/viniaquino");
		System.out.println("***********************************************************");
	}

}
