package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Fabricante
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Fabricante com a tabela t_jr_fabricante
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_fabricante")
public class Fabricante {
    /**
     * Atributo private int idFabricante
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_fabricante
     * E a @Column para mostrar que o atributo será armazenado na coluna id_fabricante no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fabricante")
    private int idFabricante;
    /**
     * Atributo privado String nome
     * Será responsável por armazenar o nome do fabricante
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome
     * do banco de dados
     */
    @Column(name = "nome")
    private String nome;
    /**
     * Atributo privado String modelo
     * Será responsável por armazenar o modelo do fabricante
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna modelo
     * do banco de dados
     */
    @Column(name = "modelo")
    private String modelo;


    /**
     * @return idFabricante
     */
    public int getIdFabricante() {
        return idFabricante;
    }

    /**
     * @param idFabricante the idFabricante to set
     */
    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    /**
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the modelo to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
