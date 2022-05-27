package org.example;

import org.example.Objects.Medicamento;
import org.example.Util.FileHelper;
import org.example.Util.MedicamentoHelper;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    static ArrayList<Medicamento> listaMedicamentos;
    public static void start(){
        listaMedicamentos = MedicamentoHelper.criarListaMedicamentos(FileHelper.getLines());
    }
    public static void main( String[] args ){
        start();
        //consultaPorNome();
        //consultarPorCodigoEan();
    }
    public static void consultaPorNome(){
        Scanner in = new Scanner(System.in);
        System.out.println("Consultar por nome: ");
        String nome = in.nextLine().toUpperCase();

        ArrayList<Medicamento> medicamentosEncontrados = new ArrayList<>();
        for (Medicamento medicamento:
                listaMedicamentos) {
            if(medicamento.getSubstancia().contains(nome)){
                if(medicamento.isComercializacao2020()) {
                    medicamentosEncontrados.add(medicamento);
                }
            }
        }

        if(!(medicamentosEncontrados.size()>0)){
            System.out.println("Nenhum medicamento encontrado");
        }
        else {
            for (Medicamento medicamento :
                    medicamentosEncontrados) {
                System.out.println("|" + medicamento.getSubstancia() + "||"
                        + medicamento.getProduto() + "||"
                        + medicamento.getApresentacao() + "||"
                        + medicamento.getPf() + "|");
            }
        }
    }

    public static void consultarPorCodigoEan(){
        Scanner in = new Scanner(System.in);
        System.out.println("Consultar por Código: ");
        String codigo = "7900000000000";

        ArrayList<Medicamento> medicamentosEncontrados = new ArrayList<>();
        for (Medicamento medicamento:
                listaMedicamentos) {
            if((medicamento.getEan1().contains(codigo))||(medicamento.getEan2().contains(codigo))||(medicamento.getEan3().contains(codigo))){
                medicamentosEncontrados.add(medicamento);
            }
        }

        if(!(medicamentosEncontrados.size()>0)){
            System.out.println("Nenhum medicamento encontrado");
        }
        else {
            Medicamento maiorPMC = medicamentosEncontrados.get(0);
            Medicamento menorPMC = medicamentosEncontrados.get(0);
            for (Medicamento medicamento :
                    medicamentosEncontrados) {
                if((medicamento.getPmc0() != null)&&(medicamento.getPmc0()>maiorPMC.getPmc0())){
                    maiorPMC = medicamento;
                }
                if((medicamento.getPmc0() != null)&&(medicamento.getPmc0()< maiorPMC.getPmc0())){
                    menorPMC = medicamento;
                }
            }
            System.out.println("Maior PMC: "+maiorPMC.getPmc0());
            System.out.println("Menor PMC: "+menorPMC.getPmc0());
            System.out.println("Diferença: "+(maiorPMC.getPmc0()-menorPMC.getPmc0()));
        }
    }
}
