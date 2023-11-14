package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Modal
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Modal com a tabela t_jr_modal
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_modal")
public class Modal {
    /**
     * Atributo private int idModal
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_modal
     * E a @Column para mostrar que o atributo será armazenado na coluna id_modal no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modal")
    private int idModal;
    /**
     * Atributo privado String modelo
     * Será responsável por armazenar o modelo do modal
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna modelo
     * do banco de dados
     */
    @Column(name ="modelo" )
    private String modelo;
    /**
     * Atributo privado String placa
     * Será responsável por armazenar a placa do modal
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna placa
     * do banco de dados
     */
    @Column(name ="placa" )
    private String placa;
    /**
     * Atributo privado boolean disponibilidade
     * Será responsável por armazenar se o modal está disponivel ou não
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna disponibilidade
     * do banco de dados
     */
    @Column(name ="disponibilidade" )
    private boolean disponibilidade;
    /**
     * Atributo privado idPrestador
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Prestador
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_prestador do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_prestador")
    private Prestador idPrestador;

    /**
     * @return idModal
     */
    public int getIdModal() {
        return idModal;
    }

    /**
     * @param idModal the idModal to set
     */
    public void setIdModal(int idModal) {
        this.idModal = idModal;
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

    /**
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return disponibilidade
     */
    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * @return idPrestador
     */
    public Prestador getIdPrestador() {
        return idPrestador;
    }

    /**
     * @param idPrestador the idPrestador to set
     */
    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }
}
