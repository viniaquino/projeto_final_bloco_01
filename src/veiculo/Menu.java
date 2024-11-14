package veiculo;

import java.util.Scanner;
import veiculo.model.Veiculo;
import veiculo.model.Carro;
import veiculo.model.Moto;

public class Menu {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(1, "A3", 2, "Audi", 2024, "Preto", "789456", 60000, true, 4, "Automatico");
		c1.visualizar();
		c1.vender();
		c1.visualizar();
		
		Moto m1 = new Moto(2, "Biz", 3, "Honda", 2025, "Cinza", "10203040", 15000, true, 2);
		m1.visualizar();
		m1.vender();
		m1.visualizar();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		
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
			
			opcao = scanner.nextInt();
			
			if (opcao == 7) {
				System.out.println("\nMotors & Cia - Acelere seus sonhos conosco!");
				scanner.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Veículo\n\n");
				
				break;
				
			case 2:
				System.out.println("Listar todos os Veículos\n\n");
				
				break;
				
			case 3:
				System.out.println("Consultar dados do Veículo - por ID\n\n");
				
				break;
				
			case 4:
				System.out.println("Atualizar dados de um Veículo\n\n");
				
				break;
				
			case 5:
				System.out.println("Apagar Veículo\n\n");
				
				break;
				
			case 6:
				System.out.println("Vender um Veículo\n\n");
				
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vinícius Aquino");
		System.out.println("Vinicius Aquino - contato.viniaquino@outlook.com");
		System.out.println("github.com/viniaquino");
		System.out.println("***********************************************************");
	}

}
