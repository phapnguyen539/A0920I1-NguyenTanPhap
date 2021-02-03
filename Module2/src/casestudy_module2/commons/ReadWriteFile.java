package casestudy_module2.commons;

import casestudy_module2.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static void writerfile(String path,String data,boolean app){
        try{
            BufferedWriter bufferedWriter;
            if (app){
                bufferedWriter=new BufferedWriter(new FileWriter(path,true));
            }else{
                bufferedWriter= new BufferedWriter(new FileWriter(path,false));
            }
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String> readFromFile(String pathFile){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                listLine.add(line);
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return listLine;
    }
    public static void readFileVilla() {
        List<Villa> villaList = new ArrayList<>();
        List<String> stringList = readFromFile("src/casestudy_module2/data/villa.csv");
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            Villa villa = new Villa(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                    (int) Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], stringSplit[6], stringSplit[7],
                    Double.parseDouble(stringSplit[8]), Integer.parseInt(stringSplit[9]));
            villaList.add(villa);
        }
    }
}
