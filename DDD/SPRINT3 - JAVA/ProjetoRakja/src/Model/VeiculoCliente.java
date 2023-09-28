package Model;

public class VeiculoCliente extends Cliente {
	
	private String numeroApolice;
	private String veiculo;
	private String placa;
	private String modelo;
	private String fabricante;
	private String chassi;
	private String implemento;
	private int ano;
	private int portas;
	private long renavam;
	
	
	public VeiculoCliente(String cpf, String nomeCompleto, String rg, int cep, String numeroApolice, String veiculo,
			String placa, String modelo, String fabricante, String chassi, String implemento, int ano, int portas,
			long renavam) {
		super(cpf, nomeCompleto, rg, cep);
		this.numeroApolice = numeroApolice;
		this.veiculo = veiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.chassi = chassi;
		this.implemento = implemento;
		this.ano = ano;
		this.portas = portas;
		this.renavam = renavam;
	}

	public VeiculoCliente(String cpf, String nomeCompleto, String numeroApolice, String veiculo,
			String placa, String modelo, String fabricante, String chassi, String implemento) {
		super(cpf, nomeCompleto);
		this.numeroApolice = numeroApolice;
		this.veiculo = veiculo;
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.chassi = chassi;
		this.implemento = implemento;
	}

	public String getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(String numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getImplemento() {
		return implemento;
	}

	public void setImplemento(String implemento) {
		this.implemento = implemento;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public long getRenavam() {
		return renavam;
	}

	public void setRenavam(long renavam) {
		this.renavam = renavam;
	}

	@Override
	public String toString() {
		return "numero da apolice: " + numeroApolice + "\n" +
				"Tipo de veículo: " + veiculo + "\n" + 
				"Placa: " + placa + "\n" +
				"Modelo: " + modelo + "\n" +
				"Fabricante: " + fabricante + "\n" +
				"Numero do Chassi: " + chassi + "\n" +
				"Tipo de Implemento: " + implemento + "\n" +
				"Ano: " + ano + "\n" +
				"Quantidade de portas: " + portas + "\n" +
				"Renavam: " + renavam + "\n" +
				"CPF do segurado: " + getCpf() + "\n" + 
				"Nome do segurado: " + getNomeCompleto() + "\n" +
				"Rg do segurado: " + getRg() + "\n" +
				"Cep do segurado: " + getCep() + "\n";
	}
}
