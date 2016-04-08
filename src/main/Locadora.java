package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

	public static ArrayList<Veiculo> cadastroVeiculos = new ArrayList<Veiculo>();
	public static ArrayList<Cliente> cadastroClientes = new ArrayList<Cliente>();
	public static ArrayList<Locacao> cadastroLocacao = new ArrayList<Locacao>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int op=0;

		do{
			op = mostraMenu();
			switch (op)
			{
			case 1:
				int opCliente = 0;

				do{
					opCliente = menuCliente();
					switch(opCliente){
					case 1:
						cadastraCliente();
						break;
					case 2:
						buscaCliente();
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					case 99:
						break;
					}
				}while(opCliente != 99);
				break;
					
			case 2:
				int opVeiculo = 0;
				
				do{
					opVeiculo = menuVeiculos();
					switch(opVeiculo){
					case 1:
						cadastraVeiculo();
						break;
					case 2:
						buscaVeiculo();
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					}
				}while(opVeiculo != 99);
				break;
				
			case 3: 
				int opLocacoes = 0;
				
				do{
					opLocacoes = menuLocacoes();
					switch(opLocacoes){
					case 1:
						efetuaLocacao();
						break;
					case 2: 
						System.out.println("OP2 Locacoes");
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					}
				}while(opLocacoes != 99);
				break;
				
			case 99:
				System.exit(0);
			default:
				System.out.println("Opção inválida!");
				break;
			}

		}while(op != 99);

	}

	public static Cliente buscaCliente(){
		System.out.println("Informe o seu RG para pesquisa: ");
		long busca = sc.nextLong();
		for(Cliente cli: cadastroClientes){
			if(busca == cli.getRg()){
				System.out.println(" Encontrei o RG que voce procurava! ");
				return cli;
			}
		}
		return null;
	}

	public static Veiculo buscaVeiculo(){
		System.out.println("Informe a placa do veiculo para pesquisa: ");
		String busca = sc.next();
		for(Veiculo vei: cadastroVeiculos){
			if(busca.equalsIgnoreCase(vei.getPlaca())){
				System.out.println(" Encontrei o veiculo que voce procurava! ");
				return vei;
			}
		}
		return null;	
	}

	public static void cadastraVeiculo(){

		Veiculo vei = new Veiculo();

		System.out.println("##### INFORMACOES DO VEICULO #####");
		System.out.println(" Informe a placa: ");
		vei.setPlaca(sc.next());
		System.out.println(" Informe o modelo: ");
		vei.setModelo(sc.next());
		System.out.println(" Informe a marca: ");
		vei.setMarca(sc.next());
		System.out.println(" Informe o ano do veiculo: ");
		vei.setAno(sc.nextInt());

		cadastroVeiculos.add(vei);

	}

	public static void cadastraCliente(){

		Cliente cli = new Cliente();

		System.out.println("##### BEM VINDO AO SISTEMA DE LOCACAO DE VEICULOS #####");
		System.out.println(" Informe seu nome para cadastro: ");
		cli.setNome(sc.next());
		System.out.println(" Informe seu CNH: ");
		cli.setCnh(sc.nextLong());
		System.out.println(" Informe seu RG: ");
		cli.setRg(sc.nextLong());

		cadastroClientes.add(cli);
	}

	public static void efetuaLocacao(){

		Locacao lol = new Locacao();

		System.out.println("##### INFORMACOES DA LOCACAO DE VEICULO #####");

		System.out.println(" Buscando cliente... ");
		Cliente cli = buscaCliente();

		if(cli == null){
			System.out.println("Cliente nao encontrado!");
		}

		System.out.println(" Buscando Veiculo... ");
		Veiculo v = buscaVeiculo();

		if(v == null){
			System.out.println("Veiculo nao encontrado!");
		}

		System.out.println(" Informe a data de retirada (dd/mm/aa): ");
		lol.setDataL(sc.next());
		System.out.println(" Informe a hora de retirada: ");
		lol.setHoraL(sc.next());


		System.out.println("##### INFORMACOES DE DEVOLUCAO DO VEICULO #####");

		System.out.println(" Informe a data de devolucao (dd/mm/aa): ");
		lol.setDataD(sc.next());
		System.out.println(" Informe a hora de devolucao: ");
		lol.setHoraD(sc.next());

		lol.setVeiculo(v);
		lol.setCliente(cli);

		cadastroLocacao.add(lol);

		lol.mostraLocacao();		
	}

	public static int mostraMenu(){

		System.out.println("#### MENU ####");
		System.out.println("Escolha uma das opcoes e aperte ENTER (99 para sair): ");

		System.out.println("1- Cadastro de Clientes");
		System.out.println("2- Cadastro de Veiculos");
		System.out.println("3- Locacoes");

		int op = sc.nextInt();

		return op;

	}

	public static int menuCliente(){

		System.out.println("#### MENU DO CLIENTE ####");
		System.out.println("Escolha uma das opcoes e aperte ENTER: ");

		System.out.println("1- Cadastro Cliente");
		System.out.println("2- Buscar Cliente ");

		int op = sc.nextInt();

		return op;
	}

	public static int menuVeiculos(){

		System.out.println("#### MENU DE VEICULOS ####");
		System.out.println("Escolha uma das opcoes e aperte ENTER: ");

		System.out.println("1- Cadastrar Veiculo");
		System.out.println("2- Buscar Veiculo");

		int op = sc.nextInt();

		return op;
	}

	public static int menuLocacoes(){

		System.out.println("#### MENU DE LOCACOES ####");
		System.out.println("Escolha uma das opcoes e aperte ENTER: ");

		System.out.println("1- Cadastro Locacoes");
		System.out.println("2- Buscar Locacoes");


		int op = sc.nextInt();

		return op;
	}


}