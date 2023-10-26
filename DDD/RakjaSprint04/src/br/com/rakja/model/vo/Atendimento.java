package br.com.rakja.model.vo;

public class Atendimento {
    private int idAtendimento;
    private String data;
    private float pbtc;
    private Localizacao idLocalizacao;
    private Cliente idCliente;
    private VeiculoCliente idVeiculo;
    private Modal idModal;

    public Atendimento(int idAtendimento, String data, float pbtc, Localizacao idLocalizacao, Cliente idCliente, VeiculoCliente idVeiculo, Modal idModal) {
        this.idAtendimento = idAtendimento;
        this.data = data;
        this.pbtc = pbtc;
        this.idLocalizacao = idLocalizacao;
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.idModal = idModal;
    }

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPbtc() {
        return pbtc;
    }

    public void setPbtc(float pbtc) {
        this.pbtc = pbtc;
    }

    public Localizacao getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Localizacao idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public VeiculoCliente getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(VeiculoCliente idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Modal getIdModal() {
        return idModal;
    }

    public void setIdModal(Modal idModal) {
        this.idModal = idModal;
    }
}
