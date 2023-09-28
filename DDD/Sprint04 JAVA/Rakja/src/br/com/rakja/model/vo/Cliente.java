package br.com.rakja.model.vo;


/**
 * Criação da classe Cliente
 *
 * @author luiz.biazzola
 * @since 09/2023
 *
 */

public class Cliente {
    private int id_cliente;
    private String cpf;
    private String nome_completo;
    private String rg;
    private Endereco endereco;

    public Cliente(int id_cliente, String cpf, String nome_completo, String rg, Endereco endereco) {
        this.id_cliente = id_cliente;
        this.cpf = cpf;
        this.nome_completo = nome_completo;
        this.rg = rg;
        this.endereco = endereco;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
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
