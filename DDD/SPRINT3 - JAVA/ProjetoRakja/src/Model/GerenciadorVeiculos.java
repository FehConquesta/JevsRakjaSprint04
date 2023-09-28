package Model;

import java.util.ArrayList;
import java.util.Scanner;


public class GerenciadorVeiculos {
	
	private ArrayList<VeiculoCliente> veiculosCadastrados;
	private Scanner input;

	public GerenciadorVeiculos() {
		veiculosCadastrados = new ArrayList<VeiculoCliente>(); 
	}
	
	public void adicionar(VeiculoCliente Veic) {
		veiculosCadastrados.add(Veic);
		System.out.println(Veic.getVeiculo() + " " + Veic.getFabricante() + " - Modelo:" + Veic.getModelo() + " - Ano:" + Veic.getAno() + " adicinado na lista!");
		System.out.println("-------------------------------------------------");
	}
	
	public void delete(int i) {
		VeiculoCliente Veic = veiculosCadastrados.get(i);
		veiculosCadastrados.remove(i);
		System.out.println(Veic.getVeiculo() + " " + 
		Veic.getFabricante() + " - Modelo:" + 
		Veic.getModelo() + " - Ano:" + 
		Veic.getAno() + " Removido!");
		System.out.println("-------------------------------------------------------");
	}
	
	public void read() {
		System.out.println("*---* Lista de veiculos cadastrado em nosso sistema *---*");
		System.out.println();
		for ( VeiculoCliente Veic : veiculosCadastrados) {
			System.out.println(Veic.toString());
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public void create(String cpf, String nomeCompleto, String rg, int cep, String numeroApolice, String veiculo,
			String placa, String modelo, String fabricante, String chassi, String implemento, int ano, int portas,
			long renavam) {
		VeiculoCliente Veic = new VeiculoCliente(cpf,nomeCompleto,rg,cep,numeroApolice,veiculo,placa,
				modelo,fabricante,chassi,implemento,ano,portas,renavam);
		adicionar(Veic);
	}
	
	public void update(int i, String cpf, String nomeCompleto, String rg, int cep, String numeroApolice, String veiculo,
			String placa, String modelo, String fabricante, String chassi, String implemento, int ano, int portas,
			long renavam) {
			if (i >= 0 && i < veiculosCadastrados.size()) {
				VeiculoCliente Veic = veiculosCadastrados.get(i);
				Veic.setNumeroApolice(numeroApolice);
				Veic.setVeiculo(veiculo);
				Veic.setPlaca(placa);
				Veic.setModelo(modelo);
				Veic.setFabricante(fabricante);
				Veic.setChassi(chassi);
				Veic.setImplemento(implemento);
				Veic.setAno(ano);
				Veic.setPortas(portas);
				Veic.setRenavam(renavam);
				Veic.setNomeCompleto(nomeCompleto);
				Veic.setRg(rg);
				Veic.setCpf(cpf);
				Veic.setCep(cep);
				System.out.println("Atualização feita com sucesso");
				System.out.println("-------------------------------------------------------");
			} else {
				System.out.println("Índice inválido ou veículo não encontrado na lista");
				System.out.println("-------------------------------------------------------");
			}
	}
	
	public void verificarVeiculo() {
	    input = new Scanner(System.in);
	    System.out.println("Olá, por favor informe o CPF do titular: ");
	    String cpfInformado = input.next();
	    boolean cpfEncontrado = false;

	    for (VeiculoCliente Veic : veiculosCadastrados) {
	        if (cpfInformado.equals(Veic.getCpf())) {
	            System.out.println("Veículo cadastrado para o CPF informado:");
	            System.out.println("Veículo: " + Veic.getVeiculo());
	            System.out.println("Placa: " + Veic.getPlaca());
	            System.out.println("Modelo: " + Veic.getModelo());
	            System.out.println("Fabricante: " + Veic.getFabricante());
	            System.out.println("----------------------------------------");
	            cpfEncontrado = true;
	        }
	    }

	    if (!cpfEncontrado) {
	        System.out.println("CPF não cadastrado em nosso sistema.");
	    }
	}
}