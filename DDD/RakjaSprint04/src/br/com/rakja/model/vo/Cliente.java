package br.com.rakja.model.vo;


/**
 * Criação da classe Cliente
 *
 * @author luiz.biazzola
 * @since 09/2023
 *
 */

public class Cliente {
    private int idCliente;
    private String cpf;
    private String nomeCompleto;
    private String rg;
    private Endereco endereco;

    public Cliente(int id_cliente, String cpf, String nome_completo, String rg, Endereco endereco) {
        this.idCliente = id_cliente;
        this.cpf = cpf;
        this.nomeCompleto = nome_completo;
        this.rg = rg;
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
