package veiculo;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
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

}
