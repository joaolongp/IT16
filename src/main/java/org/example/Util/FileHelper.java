package org.example.Util;

import java.io.*;
import java.util.ArrayList;

public class FileHelper {
    private static ArrayList<String> lines;

    public static BufferedReader openFile() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("TA_PRECO_MEDICAMENTO teste.csv")));
            lines = new ArrayList<>();
            String lineRead = reader.readLine();
            while (lineRead != null) {
                lines.add(lineRead);
                lineRead = reader.readLine();
                System.out.println(lineRead);
            }
            formatLines();
        } catch (IOException e) {
            System.out.println("Error");
        }
        return reader;
    }

    public static void formatLines() throws IOException {
        for(int i = 0; i<lines.size(); i++){
            if(hasMultipleSubstances(lines.get(i))){
                String correcao = formatLine(lines.get(i));
                lines.set(i, correcao);
                System.out.println(lines.get(i));
            }
        }
    }

    public static ArrayList<String> getLines(){
        return lines;
    }

    private static String formatLine(String line) {
        String aux[] = line.split("\";");
        aux[0] = aux[0].replace(";", ",");
        aux[0] = aux[0].replace("\"","");
        return aux[0]+";"+aux[1];
    }

    public static boolean hasMultipleSubstances(String line) {
        String aux[] = line.split(";");
        if(aux.length>40){
            return true;
        }
        return false;
    }
}
