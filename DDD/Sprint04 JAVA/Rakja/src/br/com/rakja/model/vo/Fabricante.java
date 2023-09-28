package br.com.rakja.model.vo;


/**
 * Criação da classe fabricante
 * por ela será armazenado a marca
 * dos veiculos, assim como seu modelo
 *
 * @author luiz.biazzola
 * @since 09/2023
 *
 */

public class Fabricante {
    private int id_fabricante;
    private String nome;
    private String modelo;

    public Fabricante(int id_fabricante, String nome, String modelo) {
        this.id_fabricante = id_fabricante;
        this.nome = nome;
        this.modelo = modelo;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
