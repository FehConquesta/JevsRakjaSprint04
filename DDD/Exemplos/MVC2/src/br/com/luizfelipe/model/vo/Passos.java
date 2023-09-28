package br.com.luizfelipe.model.vo;

public class Passos {
    //atributos
    private String numeroAnterior;
    private String numeroResultante;
    private String descricao;

    /**
     * Construtor que preenche os atributos do objeto
     * @param numeroAnterior - descrição....
     * @param numeroResultante
     * @param descricao
     */

    public Passos(String numeroAnterior, String numeroResultante, String descricao) {
        this.numeroAnterior = numeroAnterior;
        this.numeroResultante = numeroResultante;
        this.descricao = descricao;
    }

    /**
     * @return the numeroAnterior
     */
    public String getNumeroAnterior() {
        return numeroAnterior;
    }

    /**
     * @param numeroAnterior the numeroAnterior to set
     */
    public void setNumeroAnterior(String numeroAnterior) {
        this.numeroAnterior = numeroAnterior;
    }

    /**
     * @return the numeroResultante
     */
    public String getNumeroResultante() {
        return numeroResultante;
    }

    /**
     * @param numeroResultante the numeroResultante to set
     */
    public void setNumeroResultante(String numeroResultante) {
        this.numeroResultante = numeroResultante;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Sobrescrevendo o método toString de Object
    @Override
    public String toString() {
        if(this.getNumeroAnterior() == null) {
            //return "\nDescrição: " + getDescricao();
            return "\nDescrição: ".concat(getDescricao());
        }else {
            return getNumeroAnterior()
                    .concat(">>")
                    .concat(getNumeroResultante())
                    .concat("\nDescrição: ")
                    .concat(getDescricao())
                    .concat("\n\n");
        }
    }
}
