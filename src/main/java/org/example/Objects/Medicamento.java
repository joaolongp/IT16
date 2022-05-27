package org.example.Objects;

public class Medicamento{
    String substancia = "";
    String cnpj = "";
    String lab = "";
    String GGREM = "";
    String registro = "";
    String ean1 = "";
    String ean2 = "";
    String ean3 = "";
    String produto = "";
    String apresentacao = "";
    String classe = "";
    String tipo = "";
    String regimePreco = "";
    Float pf;
    Float pf0;
    Float pf12;
    Float pf17;
    Float pf17ALC;
    Float pf175;
    Float pf175ALC;
    Float pf18;
    Float pf18ALC;
    Float pf20;
    Float pmc0;
    Float pmc12;
    Float pmc17;
    Float pmc17ALC;
    Float pmc175;
    Float pmc175ALC;
    Float pmc18;
    Float pmc18ALC;
    Float pmc20;
    boolean restricao;
    boolean cap;
    boolean confaz87;
    boolean icmsZero;
    String analiseRecursal = "";
    ListasConcessao listaConcessaoCredito;
    boolean comercializacao2020;
    Tarja tarja;

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getGGREM() {
        return GGREM;
    }

    public void setGGREM(String GGREM) {
        this.GGREM = GGREM;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
    }

    public String getEan2() {
        return ean2;
    }

    public void setEan2(String ean2) {
        this.ean2 = ean2;
    }

    public String getEan3() {
        return ean3;
    }

    public void setEan3(String ean3) {
        this.ean3 = ean3;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegimePreco() {
        return regimePreco;
    }

    public void setRegimePreco(String regimePreco) {
        this.regimePreco = regimePreco;
    }

    public Float getPf() {
        return pf;
    }

    public void setPf(Float pf) {
        this.pf = pf;
    }

    public Float getPf0() {
        return pf0;
    }

    public void setPf0(Float pf0) {
        this.pf0 = pf0;
    }

    public Float getPf12() {
        return pf12;
    }

    public void setPf12(Float pf12) {
        this.pf12 = pf12;
    }

    public Float getPf17() {
        return pf17;
    }

    public void setPf17(Float pf17) {
        this.pf17 = pf17;
    }

    public Float getPf17ALC() {
        return pf17ALC;
    }

    public void setPf17ALC(Float pf17ALC) {
        this.pf17ALC = pf17ALC;
    }

    public Float getPf175() {
        return pf175;
    }

    public void setPf175(Float pf175) {
        this.pf175 = pf175;
    }

    public Float getPf175ALC() {
        return pf175ALC;
    }

    public void setPf175ALC(Float pf175ALC) {
        this.pf175ALC = pf175ALC;
    }

    public Float getPf18() {
        return pf18;
    }

    public void setPf18(Float pf18) {
        this.pf18 = pf18;
    }

    public Float getPf18ALC() {
        return pf18ALC;
    }

    public void setPf18ALC(Float pf18ALC) {
        this.pf18ALC = pf18ALC;
    }

    public Float getPf20() {
        return pf20;
    }

    public void setPf20(Float pf20) {
        this.pf20 = pf20;
    }

    public Float getPmc0() {
        return pmc0;
    }

    public void setPmc0(Float pmc0) {
        this.pmc0 = pmc0;
    }

    public Float getPmc12() {
        return pmc12;
    }

    public void setPmc12(Float pmc12) {
        this.pmc12 = pmc12;
    }

    public Float getPmc17() {
        return pmc17;
    }

    public void setPmc17(Float pmc17) {
        this.pmc17 = pmc17;
    }

    public Float getPmc17ALC() {
        return pmc17ALC;
    }

    public void setPmc17ALC(Float pmc17ALC) {
        this.pmc17ALC = pmc17ALC;
    }

    public Float getPmc175() {
        return pmc175;
    }

    public void setPmc175(Float pmc175) {
        this.pmc175 = pmc175;
    }

    public Float getPmc175ALC() {
        return pmc175ALC;
    }

    public void setPmc175ALC(Float pmc175ALC) {
        this.pmc175ALC = pmc175ALC;
    }

    public Float getPmc18() {
        return pmc18;
    }

    public void setPmc18(Float pmc18) {
        this.pmc18 = pmc18;
    }

    public Float getPmc18ALC() {
        return pmc18ALC;
    }

    public void setPmc18ALC(Float pmc18ALC) {
        this.pmc18ALC = pmc18ALC;
    }

    public Float getPmc20() {
        return pmc20;
    }

    public void setPmc20(Float pmc20) {
        this.pmc20 = pmc20;
    }

    public boolean isRestricao() {
        return restricao;
    }

    public void setRestricao(boolean restricao) {
        this.restricao = restricao;
    }

    public boolean isCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }

    public boolean isConfaz87() {
        return confaz87;
    }

    public void setConfaz87(boolean confaz87) {
        this.confaz87 = confaz87;
    }

    public boolean isIcmsZero() {
        return icmsZero;
    }

    public void setIcmsZero(boolean icmsZero) {
        this.icmsZero = icmsZero;
    }

    public String getAnaliseRecursal() {
        return analiseRecursal;
    }

    public void setAnaliseRecursal(String analiseRecursal) {
        this.analiseRecursal = analiseRecursal;
    }

    public ListasConcessao getListaConcessaoCredito() {
        return listaConcessaoCredito;
    }

    public void setListaConcessaoCredito(ListasConcessao listaConcessaoCredito) {
        this.listaConcessaoCredito = listaConcessaoCredito;
    }

    public boolean isComercializacao2020() {
        return comercializacao2020;
    }

    public void setComercializacao2020(boolean comercializacao2020) {
        this.comercializacao2020 = comercializacao2020;
    }

    public Tarja getTarja() {
        return tarja;
    }

    public void setTarja(Tarja tarja) {
        this.tarja = tarja;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "substancia='" + substancia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", lab='" + lab + '\'' +
                ", GGREM='" + GGREM + '\'' +
                ", registro='" + registro + '\'' +
                ", ean1='" + ean1 + '\'' +
                ", ean2='" + ean2 + '\'' +
                ", ean3='" + ean3 + '\'' +
                ", produto='" + produto + '\'' +
                ", apresentacao='" + apresentacao + '\'' +
                ", classe='" + classe + '\'' +
                ", tipo='" + tipo + '\'' +
                ", regimePreco='" + regimePreco + '\'' +
                ", pf=" + pf +
                ", pf0=" + pf0 +
                ", pf12=" + pf12 +
                ", pf17=" + pf17 +
                ", pf17ALC=" + pf17ALC +
                ", pf175=" + pf175 +
                ", pf175ALC=" + pf175ALC +
                ", pf18=" + pf18 +
                ", pf18ALC=" + pf18ALC +
                ", pf20=" + pf20 +
                ", pmc0=" + pmc0 +
                ", pmc12=" + pmc12 +
                ", pmc17=" + pmc17 +
                ", pmc17ALC=" + pmc17ALC +
                ", pmc175=" + pmc175 +
                ", pmc175ALC=" + pmc175ALC +
                ", pmc18=" + pmc18 +
                ", pmc18ALC=" + pmc18ALC +
                ", pmc20=" + pmc20 +
                ", restricao=" + restricao +
                ", cap=" + cap +
                ", confaz87=" + confaz87 +
                ", icmsZero=" + icmsZero +
                ", analiseRecursal='" + analiseRecursal + '\'' +
                ", listaConcessaoCredito=" + listaConcessaoCredito +
                ", comercializacao2020=" + comercializacao2020 +
                ", tarja=" + tarja +
                '}';
    }
}
