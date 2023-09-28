package Model;

public class SelecaoDeModal {
	
	private String[] modelo = {"Zero Grau", "Lança","Munck"};
	private String placa;
	private boolean disponibilidade;
	
	
	public SelecaoDeModal(String[] modelo, String placa, boolean disponibilidade) {
		this.modelo = modelo;
		this.placa = placa;
		this.disponibilidade = disponibilidade;
	}


	public String[] getModelo() {
		return modelo;
	}


	public void setModelo(String[] modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public boolean isDisponibilidade() {
		return disponibilidade;
	}


	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
