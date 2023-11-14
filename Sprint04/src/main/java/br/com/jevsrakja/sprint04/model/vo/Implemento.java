package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Implemento
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Implemento com a tabela t_jr_implemento
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_implemento")
public class Implemento {

    /**
     * Atributo private int idImplemento
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_implemento
     * E a @Column para mostrar que o atributo será armazenado na coluna id_implemento no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_implemento")
    private int idImplemento;

    /**
     * Atributo privado String tipoImplemento
     * Será responsável por armazenar o tipo do implemento
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna tipo_implemento
     * do banco de dados
     */
    @Column(name = "tipo_implemento")
    private String tipoImplemento;

    /**
     * @return idImplemento
     */
    public int getIdImplemento() {
        return idImplemento;
    }

    /**
     * @param idImplemento the idImplemento to set
     */
    public void setIdImplemento(int idImplemento) {
        this.idImplemento = idImplemento;
    }

    /**
     * @return tipoImplemento
     */
    public String getTipoImplemento() {
        return tipoImplemento;
    }

    /**
     * @param tipoImplemento the tipoImplemento to set
     */
    public void setTipoImplemento(String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }
}
