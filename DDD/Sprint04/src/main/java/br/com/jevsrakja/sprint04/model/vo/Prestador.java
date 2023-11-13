package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Prestador
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Prestador com a tabela t_jr_prestador
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_prestador")
public class Prestador {
    /**
     * Atributo private int idPrestador
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_prestador
     * E a @Column para mostrar que o atributo será armazenado na coluna id_prestador no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestador")
    private int idPrestador;
    /**
     * Atributo privado String nomeCompleto
     * Será responsável por armazenar o nome completo do prestador
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nomeCompleto
     * do banco de dados
     */
    @Column(name = "nome_completo")
    private String nomeCompleto;
    /**
     * Atributo privado String cpf
     * Será responsável por armazenar o cpf do prestador
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna cpf
     * do banco de dados
     */
    @Column(name ="cpf")
    private String cpf;
    /**
     * Atributo privado String rg
     * Será responsável por armazenar o rg do prestador
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna rg
     * do banco de dados
     */
    @Column(name = "rg")
    private String rg;
    /**
     * Atributo privado idEndereco
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Endereco
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_endereco do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco idEndereco;

    /**
     * @return idPrestador
     */
    public int getIdPrestador() {
        return idPrestador;
    }

    /**
     * @param idPrestador the idPrestador to set
     */
    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    /**
     * @return nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return idEndereco
     */
    public Endereco getIdEndereco() {
        return idEndereco;
    }

    /**
     * @param idEndereco the idEndereco to set
     */
    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }
}


