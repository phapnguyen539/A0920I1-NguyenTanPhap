package commons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String> readFile(String pathFile){
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

public static void writerfile(String path,String data,boolean app) {
    try {
        BufferedWriter bufferedWriter;
        if (app) {
            bufferedWriter = new BufferedWriter(new FileWriter(path, true));
        } else {
            bufferedWriter = new BufferedWriter(new FileWriter(path, false));
        }
        bufferedWriter.write(data);
        bufferedWriter.newLine();
        bufferedWriter.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}