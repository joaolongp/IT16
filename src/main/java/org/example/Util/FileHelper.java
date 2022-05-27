package org.example.Util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FileHelper {
    private static ArrayList<String> lines;

    protected static ArrayList<String> openFile(){
        lines = new ArrayList<>();
        File file = new File("TA_PRECO_MEDICAMENTO teste.csv");
        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)
            ) {
                String lineRead;
                while ((lineRead = br.readLine()) != null) {
                    lines.add(lineRead);
                }
            return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected static ArrayList<String> formatLines(ArrayList<String> lineList){
        for(int i = 0; i<lineList.size(); i++){
            if(hasMultipleSubstances(lineList.get(i))){
                String fix = formatLine(lineList.get(i));
                lineList.set(i, fix);
            }
        }
        return lineList;
    }

    public static ArrayList<String> getLines(){
        return formatLines(openFile());
    }

    public static String getLineByIndex(int index){
        return getLines().get(index);
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
