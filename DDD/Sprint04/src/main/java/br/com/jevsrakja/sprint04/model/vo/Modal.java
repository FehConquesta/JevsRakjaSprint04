package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_modal")
public class Modal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modal")
    private int idModal;
    @Column(name ="modelo" )
    private String modelo;
    @Column(name ="placa" )
    private String placa;
    @Column(name ="disponibilidade" )
    private boolean disponibilidade;
    @ManyToOne
    @JoinColumn(name = "id_prestador")
    private Prestador idPrestador;

    public int getIdModal() {
        return idModal;
    }

    public void setIdModal(int idModal) {
        this.idModal = idModal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Prestador getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Prestador idPrestador) {
        this.idPrestador = idPrestador;
    }
}
