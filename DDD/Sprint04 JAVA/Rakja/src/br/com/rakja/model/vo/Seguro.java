package br.com.rakja.model.vo;

/**
 * Criação da classe Seguro
 *
 * @author luiz.biazzola
 * @since 28/09/2023
 *
 */

public class Seguro {
    private String numero_apolice;
    private Cliente id_cliente;

    public Seguro(String numero_apolice, Cliente id_cliente) {
        this.numero_apolice = numero_apolice;
        this.id_cliente = id_cliente;
    }

    public String getNumero_apolice() {
        return numero_apolice;
    }

    public void setNumero_apolice(String numero_apolice) {
        this.numero_apolice = numero_apolice;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }
}
