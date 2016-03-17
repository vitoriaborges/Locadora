package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {

	public static ArrayList<Veiculo> cadastroVeiculos = new ArrayList<Veiculo>();
	public static ArrayList<Cliente> cadastroClientes = new ArrayList<Cliente>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Cliente loc = new Cliente();
		
		
	System.out.println("##### BEM VINDO AO SISTEMA DE LOCACAO DE VEICULOS #####");
	
		System.out.println(" Informe seu nome para cadastro: ");
		loc.setNome(sc.next());
		System.out.println(" Informe seu CNH: ");
		loc.setCnh(sc.nextLong());
		System.out.println(" Informe seu RG: ");
		loc.setRg(sc.nextLong());
		
		
		
	
	}
}
