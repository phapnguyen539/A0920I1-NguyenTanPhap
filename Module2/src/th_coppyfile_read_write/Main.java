package th_coppyfile_read_write;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyJavaFile(File source,File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
    private static void copyStreamFile(File source, File dest) throws IOException{
        InputStream inputStream= null;
        OutputStream outputStream= null;
       try {
           inputStream= new FileInputStream(source);
           outputStream= new FileOutputStream(dest);
           byte[] bytes= new byte[1024];
           int length;
           while ((length=inputStream.read(bytes))>0){
               outputStream.write(bytes,0,length);
           }
       }finally {
           inputStream.close();
           outputStream.close();
       }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập File nguồn:");
        String sourcePath= scanner.nextLine();
        System.out.println("Nhập File đích:");
        String destPath= scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
          //copyJavaFile  (sourceFile, destFile);
            copyStreamFile(sourceFile, destFile);
            System.out.printf("Đã sao chép");
        } catch (IOException ioe) {
            System.out.printf("Không thể sao chép");
            System.out.printf(ioe.getMessage());
        }
    }
    }

