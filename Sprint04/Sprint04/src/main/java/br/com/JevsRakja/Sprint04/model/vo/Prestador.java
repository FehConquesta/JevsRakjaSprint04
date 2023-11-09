package br.com.JevsRakja.Sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_prestador")
public class Prestador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestador")
    private int idPrestador;

    @Column(name = "nome_completo")
    private String nomeCompleto;
    @Column(name ="cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Column(name = "id_endereco")
    private Endereco idEndereco;

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }
}
