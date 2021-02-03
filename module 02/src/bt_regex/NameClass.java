package bt_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    public static final String  inputName="(C|A|P)\\d{4}(G|H|I|K|L|M)";
    public NameClass(){
    }
    public boolean validate(String regex){
        Pattern pattern= Pattern.compile(inputName);
        Matcher matcher= pattern.matcher(regex);
        return matcher.find();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời nhập tên lớp:");
        String name = scanner.nextLine();


    }
    }
