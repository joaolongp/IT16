package org.example.Util;

import org.example.Objects.ListasConcessao;
import org.example.Objects.Medicamento;
import org.example.Objects.Tarja;

public class MedicamentoHelper {
    public static Medicamento criarMedicamento(String[] atributos){
        Medicamento medicamento = new Medicamento();
        medicamento.setSubstancia(atributos[0]);
        medicamento.setCnpj(atributos[1]);
        medicamento.setLab(atributos[2]);
        medicamento.setGGREM(atributos[3]);
        medicamento.setRegistro(atributos[4]);
        medicamento.setEan1(atributos[5]);
        medicamento.setEan2(atributos[6]);
        medicamento.setEan3(atributos[7]);
        medicamento.setProduto(atributos[8]);
        medicamento.setApresentacao(atributos[9]);
        medicamento.setClasse(atributos[10]);
        medicamento.setTipo(atributos[11]);
        medicamento.setRegimePreco(atributos[12]);
        medicamento.setPf(formatPrice(atributos[13]));
        medicamento.setPf0(formatPrice(atributos[14]));
        medicamento.setPf12(formatPrice(atributos[15]));
        medicamento.setPf17(formatPrice(atributos[16]));
        medicamento.setPf17ALC(formatPrice(atributos[17]));
        medicamento.setPf175(formatPrice(atributos[18]));
        medicamento.setPf175ALC(formatPrice(atributos[19]));
        medicamento.setPf18(formatPrice(atributos[20]));
        medicamento.setPf18ALC(formatPrice(atributos[21]));
        medicamento.setPf20(formatPrice(atributos[22]));
        medicamento.setPmc0(formatPrice(atributos[23]));
        medicamento.setPmc12(formatPrice(atributos[24]));
        medicamento.setPmc17(formatPrice(atributos[25]));
        medicamento.setPmc17ALC(formatPrice(atributos[26]));
        medicamento.setPmc175(formatPrice(atributos[27]));
        medicamento.setPmc175ALC(formatPrice(atributos[28]));
        medicamento.setPmc18(formatPrice(atributos[29]));
        medicamento.setPmc18ALC(formatPrice(atributos[30]));
        medicamento.setPmc20(formatPrice(atributos[31]));
        medicamento.setRestricao(Boolean.parseBoolean(atributos[32]));
        medicamento.setCap(Boolean.parseBoolean(atributos[33]));
        medicamento.setConfaz87(Boolean.parseBoolean(atributos[34]));
        medicamento.setIcmsZero(Boolean.parseBoolean(atributos[35]));
        medicamento.setAnaliseRecursal(atributos[36]);
        medicamento.setListaConcessaoCredito(ListasConcessao.valueOf(atributos[37]));
        medicamento.setComercializacao2020(Boolean.parseBoolean(atributos[38]));
        medicamento.setTarja(tarja(atributos[39]));
        return medicamento;
    }

    private static float formatPrice(String price){
        price = price.replace(",",".");
        return Float.parseFloat(price);
    }

    private static Tarja tarja(String tarja){
        if(tarja.contains("Vermelha")){
            return Tarja.Vermelha;
        }
        else if(tarja.contains("Preta")){
            return Tarja.Preta;
        }
        return Tarja.Livre;
    }
}
