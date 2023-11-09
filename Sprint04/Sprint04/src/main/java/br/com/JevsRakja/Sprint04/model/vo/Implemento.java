package br.com.JevsRakja.Sprint04.model.vo;


import jakarta.persistence.*;

@Entity
@Table(name = "t_jr_implemento")
public class Implemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_implemento")
    private int idImplemento;

    @Column(name = "tipo_implemento")
    private String tipoImplemento;

    public int getIdImplemento() {
        return idImplemento;
    }

    public void setIdImplemento(int idImplemento) {
        this.idImplemento = idImplemento;
    }

    public String getTipoImplemento() {
        return tipoImplemento;
    }

    public void setTipoImplemento(String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }
}
