package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do cliente
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Cliente com a tabela t_jr_cliente
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_cliente")
public class Cliente {
    /**
     * Atributo private int idCliente
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_cliente
     * E a @Column para mostrar que o atributo será armazenado na coluna id_cliente no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private int idCliente;
    /**
     * Atributo privado String cpf
     * Será responsável por armazenar o cpf
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna cpf
     * do banco de dados
     */
    @Column(name = "cpf")
    private String cpf;
    /**
     * Atributo privado String nomeCompleto
     * Será responsável por armazenar o nome completo
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna nome_completo
     * do banco de dados
     */
    @Column(name = "nome_completo")
    private String nomeCompleto;
    /**
     * Atributo privado String rg
     * Será responsável por armazenaso rg
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna rg
     * do banco de dados
     */
    @Column(name = "rg")
    private String rg;
    /**
     * Atributo privado endereco
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Endereco
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_endereco do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    /**
     * @return idCLiente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
     * @return endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
