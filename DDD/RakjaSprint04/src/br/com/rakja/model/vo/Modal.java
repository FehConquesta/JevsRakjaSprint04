package br.com.rakja.model.vo;

public class Modal {
    private int idModal;
    private String modelo;
    private String placa;
    private boolean disponibilidade;
    private Prestador idPrestador;

    public Modal(int idModal, String modelo, String placa, boolean disponibilidade, Prestador idPrestador) {
        this.idModal = idModal;
        this.modelo = modelo;
        this.placa = placa;
        this.disponibilidade = disponibilidade;
        this.idPrestador = idPrestador;
    }

    public int getIdModal() {
        return idModal;
    }

    public void setIdModal(int idModal) {
        this.idModal = idModal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
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

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }
}
