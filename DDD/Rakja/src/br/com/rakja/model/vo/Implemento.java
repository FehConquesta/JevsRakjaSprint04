package br.com.rakja.model.vo;


/**
 * Criação da classe implemento, que será responsavel
 * por setar o tipo de implemento que o veiculo terá
 * a escolha do modal é fortemente influenciada pelo
 * implemento que o veiculo possui
 *
 * @author luiz.biazzola
 * @since 09/2023
 *
 */
public class Implemento {
    private int id_implemento;
    private String tipoImplemento;


    public Implemento(int id_implemento,String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }

    public int getId_implemento() {
        return id_implemento;
    }

    public void setId_implemento(int id_implemento) {
        this.id_implemento = id_implemento;
    }

    public String getTipoImplemento() {
        return tipoImplemento;
    }

    public void setTipoImplemento(String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }
}
