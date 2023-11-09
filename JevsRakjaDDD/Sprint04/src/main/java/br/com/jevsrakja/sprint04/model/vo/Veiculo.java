package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_veiculo_cliente")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo")
    private int idVeiculo;
    @Column(name ="placa" )
    private String placa;
    @Column(name ="ano" )
    private int ano;
    @Column(name ="portas" )
    private int portas;
    @Column(name ="renavam" )
    private long renavam;
    @ManyToOne
    @JoinColumn(name ="numero_apolice" )
    private Seguro apolice;
    @ManyToOne
    @JoinColumn(name = "id_fabricante")
    private Fabricante fabricante;
    @ManyToOne
    @JoinColumn(name ="id_implemento" )
    private Implemento implemento;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public Seguro getApolice() {
        return apolice;
    }

    public void setApolice(Seguro apolice) {
        this.apolice = apolice;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Implemento getImplemento() {
        return implemento;
    }

    public void setImplemento(Implemento implemento) {
        this.implemento = implemento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

