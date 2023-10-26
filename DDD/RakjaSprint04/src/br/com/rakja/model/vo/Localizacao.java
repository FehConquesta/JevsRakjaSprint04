package br.com.rakja.model.vo;

public class Localizacao {
    private int idLocalizacao;
    private String nomeRodovia;
    private int km;
    private String cep;
    private String referencia;

    public Localizacao(int idLocalizacao, String nomeRodovia, int km, String cep, String referencia) {
        this.idLocalizacao = idLocalizacao;
        this.nomeRodovia = nomeRodovia;
        this.km = km;
        this.cep = cep;
        this.referencia = referencia;
    }

    public Localizacao(int idLocalizacao, String nomeRodovia, int km) {
        this.idLocalizacao = idLocalizacao;
        this.nomeRodovia = nomeRodovia;
        this.km = km;
    }

    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(int idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getNomeRodovia() {
        return nomeRodovia;
    }

    public void setNomeRodovia(String nomeRodovia) {
        this.nomeRodovia = nomeRodovia;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
