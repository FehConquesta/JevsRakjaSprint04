package br.com.jevsrakja.sprint04.model.vo;

import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_fabricante")
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fabricante")
    private int id_fabricante;
    @Column(name = "nome")
    private String nome;
    @Column(name = "modelo")
    private String modelo;

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
