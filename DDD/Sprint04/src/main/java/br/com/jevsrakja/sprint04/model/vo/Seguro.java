package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Seguro
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Seguro com a tabela t_jr_seguro
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_seguro")
public class Seguro {
    /**
     * Atributo private String numeroApolice
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * E a @Column para mostrar que o atributo será armazenado na coluna numero_apolice no banco de dados
     */
    @Id
    @Column(name = "numero_apolice")
    private String numeroApolice;
    /**
     * Atributo privado idCliente
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Cliente
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_cliente banco de dados
     */
    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente idCliente;

    /**
     * @return numeroApolice
     */
    public String getNumeroApolice() {
        return numeroApolice;
    }

    /**
     * @param numeroApolice the numeroApolice to set
     */
    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    /**
     * @return idCliente
     */
    public Cliente getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
}