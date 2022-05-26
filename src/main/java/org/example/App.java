package org.example;

import org.example.Objects.Medicamento;
import org.example.Util.FileHelper;
import org.example.Util.MedicamentoHelper;

import java.io.IOException;
import java.util.ArrayList;

public class App
{
    static void run() throws IOException {
        FileHelper.openFile();
    }

    public static void main( String[] args ) throws IOException {
        run();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(MedicamentoHelper.criarMedicamento(FileHelper.getLines().get(1).split(";")));

        System.out.println(medicamentos.get(0).getTarja());
    }
}
