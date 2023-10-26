package br.com.rakja.model.vo;

public class VeiculoCliente {
    private int idVeiculo;
    private String placa;
    private int ano;
    private int portas;
    private long renavam;
    private Seguro apolice;
    private Implemento implemento;
    private Cliente cliente;

    public VeiculoCliente(int id_veiculo, String placa, int ano, int portas, long renavam, Seguro apolice, Implemento implemento, Cliente cliente) {
        this.idVeiculo = id_veiculo;
        this.placa = placa;
        this.ano = ano;
        this.portas = portas;
        this.renavam = renavam;
        this.apolice = apolice;
        this.implemento = implemento;
        this.cliente = cliente;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public Seguro getApolice() {
        return apolice;
    }

    public void setApolice(Seguro apolice) {
        this.apolice = apolice;
    }

    public Implemento getImplemento() {
        return implemento;
    }

    public void setImplemento(Implemento implemento) {
        this.implemento = implemento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
