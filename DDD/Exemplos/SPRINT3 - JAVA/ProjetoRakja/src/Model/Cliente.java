package Model;

public class Cliente {
	
	private String cpf;
	private String nomeCompleto;
	private String rg;
	private int cep;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf, String nomeCompleto, String rg, int cep) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.rg = rg;
		this.cep = cep;
	}
	
	public Cliente(String cpf, String nomeCompleto) {
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}
	
}
