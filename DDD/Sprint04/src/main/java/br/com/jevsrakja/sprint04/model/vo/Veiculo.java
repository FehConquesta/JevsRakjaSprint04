package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;
/**
 * Classe VO do Veiculo
 * Foi utilizado as marcações @Entity e @Table do Spring para ligar a classe
 * Veiculo com a tabela t_jr_veiculo_cliente
 *
 * @author Luiz Felipe Biazzola Cavalcante
 */
@Entity
@Table(name = "t_jr_veiculo_cliente")
public class Veiculo {
    /**
     * Atributo private int idVeiculo
     * Foi utilizado as marcação @Id para informar que no banco de dados este atributo será a chave
     * primeria
     * A marcação @GeneratedValues(strategy = GenerationType.IDENTITY) para gerar automaticamente o valor
     * de id quando for inserido algum valor na tabela t_jr_veiculo_cliente
     * E a @Column para mostrar que o atributo será armazenado na coluna id_veiculo no banco de dados
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo")
    private int idVeiculo;
    /**
     * Atributo privado String placa
     * Será responsável por armazenar a placa do veiculo
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna placa
     * do banco de dados
     */
    @Column(name ="placa" )
    private String placa;
    /**
     * Atributo privado int ano
     * Será responsável por armazenar o ano do veiculo
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna ano
     * do banco de dados
     */
    @Column(name ="ano" )
    private int ano;
    /**
     * Atributo privado int portas
     * Será responsável por armazenar a quantidade de portas do veiculo
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna portas
     * do banco de dados
     */
    @Column(name ="portas" )
    private int portas;
    /**
     * Atributo privado long renavam
     * Será responsável por armazenar o renavam do veiculo
     * Foi usado a marcação @Column para mostrar que o atributo será armazenado na coluna renavam
     * do banco de dados
     */
    @Column(name ="renavam" )
    private long renavam;
    /**
     * Atributo privado numeroApolice
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Seguro
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna numero_apolice do banco de dados
     */
    @ManyToOne
    @JoinColumn(name ="numero_apolice" )
    private Seguro numeroApolice;
    /**
     * Atributo privado idFabricante
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Fabricante
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_fabricante do banco de dados
     */
    @ManyToOne
    @JoinColumn(name = "id_fabricante")
    private Fabricante idFabricante;
    /**
     * Atributo privado idImplemento
     * Será uma das chaves estrangeiras da tabela, a informação dela será recebida da classe Implemento
     * Foi usado as marcações @ManytoOne para mostrar que é uma chave estrangeira
     * E @JoinColumn para que o atributo seja armazenado na coluna id_implemento do banco de dados
     */
    @ManyToOne
    @JoinColumn(name ="id_implemento" )
    private Implemento idImplemento;
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
     * @return idVeiculo
     */
    public int getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * @param idVeiculo the idVeiculo to set
     */
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
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
     * @return ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }

    /**
     * @return renavam
     */
    public long getRenavam() {
        return renavam;
    }

    /**
     * @param renavam the renavam to set
     */
    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    /**
     * @return numeroApolice
     */
    public Seguro getApolice() {
        return numeroApolice;
    }

    /**
     * @param apolice the idVeiculo to set
     */
    public void setApolice(Seguro apolice) {
        this.numeroApolice = apolice;
    }

    /**
     * @return idFabricante
     */
    public Fabricante getIdFabricante() {
        return idFabricante;
    }

    /**
     * @param idFabricante the idFabricante to set
     */
    public void setIdFabricante(Fabricante idFabricante) {
        this.idFabricante = idFabricante;
    }

    /**
     * @return idImplemento
     */
    public Implemento getIdImplemento() {
        return idImplemento;
    }

    /**
     * @param idImplemento the idImplemento to set
     */
    public void setIdImplemento(Implemento idImplemento) {
        this.idImplemento = idImplemento;
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

