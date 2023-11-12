package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

/**
 * Classe VO do atendimento
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Atendimento com a tabela t_jr_atendimento
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_atendimento")
public class Atendimento {

    /**
     * Atributo private int idAtendimento
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_atendimento
     * E a @Column para mostrar que o atributo será armazenado na coluna id_atendimento no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atendimento")
    private int idAtendimento;
    /**
     * Atributo privado String data
     * Será responsável por armazenas a data do atendimento
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna data_atendimento
     * do banco de dados
     */
    @Column(name = "data_atendimento")
    private String data;
    /**
     * Atributo privado pbtc
     * Será responsável por armazenar a informação de Peso Bruto Total Carregado
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna pbtc do
     * banco de dados
     */
    @Column(name = "pbtc")
    private float pbtc;

    /**
     * Atributo privado idLocalizacao
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Localizacao
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_localizacao do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_localizacao")
    private Localizacao idLocalizacao;
    /**
     * Atributo privado idCliente
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Cliente
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_cliente do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;
    /**
     * Atributo privado idVeiculo
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Veiculo
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_veiculo do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo idVeiculo;
    /**
     * Atributo privado idModal
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Modal
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_modal do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_modal")
    private Modal idModal;

    /**
     * @return the idAtendimento
     */
    public int getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * @param idAtendimento the idAtendimento to set
     */

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    /**
     * @return data
     */
    public String getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    /**
     * @return pbtc
     */
    public float getPbtc() {
        return pbtc;
    }

    /**
     * @param pbtc the pbtc to set
     */
    public void setPbtc(float pbtc) {
        this.pbtc = pbtc;
    }

    /**
     * @return idLocalizacao
     */
    public Localizacao getIdLocalizacao() {
        return idLocalizacao;
    }

    /**
     * @param idLocalizacao the idLocalizacao to set
     */
    public void setIdLocalizacao(Localizacao idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
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

    /**
     * @return idVeiculo
     */
    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    /**
     * @return idModal
     */
    public Modal getIdModal() {
        return idModal;
    }

    /**
     * @param idModal the idModal to set
     */
    public void setIdModal(Modal idModal) {
        this.idModal = idModal;
    }


}

