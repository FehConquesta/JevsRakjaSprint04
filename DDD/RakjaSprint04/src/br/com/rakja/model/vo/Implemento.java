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
    private int idImplemento;
    private String tipoImplemento;


    public Implemento(int id_implemento,String tipoImplemento) {
        this.tipoImplemento = tipoImplemento;
    }

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
