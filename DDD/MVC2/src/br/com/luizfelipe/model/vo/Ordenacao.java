package br.com.luizfelipe.model.vo;

public class Ordenacao {
    // atributos
    private int numeroOriginal;
    private String numeroOrdenado;
    private int qtdeTrocas;


    /**
     *
     * Constructor padrão que insere os atributos no objeto
     * @param numeroOriginal
     * @param numeroOrdenado
     * @param qtdeTrocas
     */

    public Ordenacao(int numeroOriginal, String numeroOrdenado, int qtdeTrocas) {
        this.numeroOriginal = numeroOriginal;
        this.numeroOrdenado = numeroOrdenado;
        this.qtdeTrocas = qtdeTrocas;
    }


    /**
     * @return the numeroOriginal
     */
    public int getNumeroOriginal() {
        return numeroOriginal;
    }


    /**
     * @param numeroOriginal the numeroOriginal to set
     */
    public void setNumeroOriginal(int numeroOriginal) {
        this.numeroOriginal = numeroOriginal;
    }


    /**
     * @return the numeroOrdenado
     */
    public String getNumeroOrdenado() {
        return numeroOrdenado;
    }


    /**
     * @param numeroOrdenado the numeroOrdenado to set
     */
    public void setNumeroOrdenado(String numeroOrdenado) {
        this.numeroOrdenado = numeroOrdenado;
    }


    /**
     * @return the qtdeTrocas
     */
    public int getQtdeTrocas() {
        return qtdeTrocas;
    }


    /**
     * @param qtdeTrocas the qtdeTrocas to set
     */
    public void setQtdeTrocas(int qtdeTrocas) {
        this.qtdeTrocas = qtdeTrocas;
    }

    //Sobrescrevendo o toString do objeto
    @Override
    public String toString() {
        return
                String.valueOf(this.numeroOriginal)
                        .concat("Virou: \n")
                        .concat(String.valueOf(this.numeroOrdenado))
                        .concat("\nQtde de trocas: ")
                        .concat(String.valueOf(this.qtdeTrocas));
    }
}

