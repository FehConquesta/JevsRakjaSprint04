package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_atendimento")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atendimento")
    private int idAtendimento;
    @Column(name = "data_atendimento")
    private String data;
    @Column(name = "pbtc")
    private float pbtc;
    @ManyToOne
    @JoinColumn(name = "id_localizacao")
    private Localizacao idLocalizacao;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;
    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo idVeiculo;
    @ManyToOne
    @JoinColumn(name = "id_modal")
    private Modal idModal;

    public int getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(int idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getPbtc() {
        return pbtc;
    }

    public void setPbtc(float pbtc) {
        this.pbtc = pbtc;
    }

    public Localizacao getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(Localizacao idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Modal getIdModal() {
        return idModal;
    }

    public void setIdModal(Modal idModal) {
        this.idModal = idModal;
    }
}

