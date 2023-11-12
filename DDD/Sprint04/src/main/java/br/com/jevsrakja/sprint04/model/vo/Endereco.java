package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do Endereco
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Endereco com a tabela t_jr_endereco
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name="t_jr_endereco")
public class Endereco {
    /**
     * Atributo private int idEndereco
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_endereco
     * E a @Column para mostrar que o atributo será armazenado na coluna id_endereco no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private int id;
    /**
     * Atributo privado String cep
     * Será responsável por armazenar o cep do endereço
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna cep
     * do banco de dados
     */
    @Column(name = "cep")
    private String cep;
    /**
     * Atributo privado String logradouro
     * Será responsável por armazenar o logradouro do endereço
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna logradouro
     * do banco de dados
     */
    @Column(name = "logradouro")
    private String logradouro;
    /**
     * Atributo privado int numero
     * Será responsável por armazenar o numero do endereço
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna numero
     * do banco de dados
     */
    @Column(name = "numero")
    private int numero;
    /**
     * Atributo privado String complemento
     * Será responsável por armazenar o complemento do endereço
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna complemento
     * do banco de dados
     */
    @Column(name = "complemento")
    private String complemento;
    /**
     * Atributo privado String referencia
     * Será responsável por armazenar a referencia do endereço
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna referencia
     * do banco de dados
     */
    @Column(name = "referencia")
    private String referencia;

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
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


