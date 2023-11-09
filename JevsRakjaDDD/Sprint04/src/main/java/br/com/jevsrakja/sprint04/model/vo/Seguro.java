package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_seguro")
public class Seguro {

    @Id
    @Column(name = "numero_apolice")
    private String numero_apolice;
    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private Cliente id_cliente;

    public String getNumero_apolice() {
        return numero_apolice;
    }

    public void setNumero_apolice(String numero_apolice) {
        this.numero_apolice = numero_apolice;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }
}