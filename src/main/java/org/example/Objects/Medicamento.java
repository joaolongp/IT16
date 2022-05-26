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
    float pf;
    float pf0;
    float pf12;
    float pf17;
    float pf17ALC;
    float pf175;
    float pf175ALC;
    float pf18;
    float pf18ALC;
    float pf20;
    float pmc0;
    float pmc12;
    float pmc17;
    float pmc17ALC;
    float pmc175;
    float pmc175ALC;
    float pmc18;
    float pmc18ALC;
    float pmc20;
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

    public float getPf() {
        return pf;
    }

    public void setPf(float pf) {
        this.pf = pf;
    }

    public float getPf0() {
        return pf0;
    }

    public void setPf0(float pf0) {
        this.pf0 = pf0;
    }

    public float getPf12() {
        return pf12;
    }

    public void setPf12(float pf12) {
        this.pf12 = pf12;
    }

    public float getPf17() {
        return pf17;
    }

    public void setPf17(float pf17) {
        this.pf17 = pf17;
    }

    public float getPf17ALC() {
        return pf17ALC;
    }

    public void setPf17ALC(float pf17ALC) {
        this.pf17ALC = pf17ALC;
    }

    public float getPf175() {
        return pf175;
    }

    public void setPf175(float pf175) {
        this.pf175 = pf175;
    }

    public float getPf175ALC() {
        return pf175ALC;
    }

    public void setPf175ALC(float pf175ALC) {
        this.pf175ALC = pf175ALC;
    }

    public float getPf18() {
        return pf18;
    }

    public void setPf18(float pf18) {
        this.pf18 = pf18;
    }

    public float getPf18ALC() {
        return pf18ALC;
    }

    public void setPf18ALC(float pf18ALC) {
        this.pf18ALC = pf18ALC;
    }

    public float getPf20() {
        return pf20;
    }

    public void setPf20(float pf20) {
        this.pf20 = pf20;
    }

    public float getPmc0() {
        return pmc0;
    }

    public void setPmc0(float pmc0) {
        this.pmc0 = pmc0;
    }

    public float getPmc12() {
        return pmc12;
    }

    public void setPmc12(float pmc12) {
        this.pmc12 = pmc12;
    }

    public float getPmc17() {
        return pmc17;
    }

    public void setPmc17(float pmc17) {
        this.pmc17 = pmc17;
    }

    public float getPmc17ALC() {
        return pmc17ALC;
    }

    public void setPmc17ALC(float pmc17ALC) {
        this.pmc17ALC = pmc17ALC;
    }

    public float getPmc175() {
        return pmc175;
    }

    public void setPmc175(float pmc175) {
        this.pmc175 = pmc175;
    }

    public float getPmc175ALC() {
        return pmc175ALC;
    }

    public void setPmc175ALC(float pmc175ALC) {
        this.pmc175ALC = pmc175ALC;
    }

    public float getPmc18() {
        return pmc18;
    }

    public void setPmc18(float pmc18) {
        this.pmc18 = pmc18;
    }

    public float getPmc18ALC() {
        return pmc18ALC;
    }

    public void setPmc18ALC(float pmc18ALC) {
        this.pmc18ALC = pmc18ALC;
    }

    public float getPmc20() {
        return pmc20;
    }

    public void setPmc20(float pmc20) {
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
}
