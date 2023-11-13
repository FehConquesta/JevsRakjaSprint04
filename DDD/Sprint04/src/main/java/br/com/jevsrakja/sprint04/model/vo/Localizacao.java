package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Localizacao
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Localizacao com a tabela t_jr_localizacao
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_localizacao")
public class Localizacao {
    /**
     * Atributo private int idLocalizacao
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_localizacao
     * E a @Column para mostrar que o atributo será armazenado na coluna id_localizacao no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private int idLocalizacao;
    /**
     * Atributo privado String nomeRodovia
     * Será responsável por armazenar o nome da rodovia da localizacao
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome_rodovia
     * do banco de dados
     */
    @Column(name ="nome_rodovia" )
    private String nomeRodovia;
    /**
     * Atributo privado int km
     * Será responsável por armazenar o km da localizacao
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna km
     * do banco de dados
     */
    @Column(name ="km" )
    private int km;
    /**
     * Atributo privado String cep
     * Será responsável por armazenar o cep da localizacao
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna cep
     * do banco de dados
     */
    @Column(name ="cep" )
    private String cep;
    /**
     * Atributo privado String referencia
     * Será responsável por armazenar a referencia da localizacao
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna referencia
     * do banco de dados
     */
    @Column(name ="referencia",nullable = true )
    private String referencia;

    /**
     * @return idLocalizacao
     */
    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    /**
     * @param idLocalizacao the idLocalizacao to set
     */
    public void setIdLocalizacao(int idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    /**
     * @return nomeRodovia
     */
    public String getNomeRodovia() {
        return nomeRodovia;
    }

    /**
     * @param nomeRodovia the nomeRodovia to set
     */
    public void setNomeRodovia(String nomeRodovia) {
        this.nomeRodovia = nomeRodovia;
    }

    /**
     * @return km
     */
    public int getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * @return cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
