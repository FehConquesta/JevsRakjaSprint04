package br.com.rakja.model.vo;

/**
 * Criação da classe endereço
 * para utilização do cadastro dos clientes
 *
 * @author luiz.biazzola
 * @since 09/2023
 *
 */

public class Endereco {
    private int idEndereco;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String referencia;

    public Endereco() {
    }

    public Endereco(int idEndereco, String cep, String logradouro, int numero, String complemento, String referencia) {
        this.idEndereco = idEndereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public Endereco(int id_endereco, String cep, String logradouro, int numero) {
        this.idEndereco = id_endereco;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
