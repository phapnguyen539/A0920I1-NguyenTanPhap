package casestudy_module2.commons;


import casestudy_module2.exception.BirthdayException;
import casestudy_module2.exception.EmailException;
import casestudy_module2.exception.IdCarException;
import casestudy_module2.exception.NameException;
import th_validate.EmailExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValid {
    private static final String NameRegex = "^([A-Z][a-z]+ )*";
    private static final String EmailRegex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String IdCardRegex = "^\\d{3}\\s\\d{3}\\s\\d{3}$";
    private static final String BirthdayRegex = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
    private static Scanner scanner = new Scanner(System.in);
    private static Pattern pattern;
    private Matcher matcher;

    public boolean validName(String name) throws NameException {
        pattern = Pattern.compile(NameRegex);
        matcher = pattern.matcher(name);
        if (!matcher.matches()) {
            throw new NameException("Ký tự đầu tiên phải viết hoa.");
        } else {
            return true;
        }
    }

    public boolean validEmail(String email) throws EmailException {
        pattern = Pattern.compile(EmailRegex);
        matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new EmailException("Nhập Email phải đúng định dạng abc@abc.abc");
        } else {
            return true;
        }
    }

    public boolean validIdCar(String idCar) throws IdCarException {
        pattern = Pattern.compile(IdCardRegex);
        matcher = pattern.matcher(idCar);
        if (!matcher.matches()) {
            throw new IdCarException("Id card phải đúng định dạng 9 chữ số XXXXXXXXX.");
        } else {
            return true;
        }
    }

    public boolean validBirthday(String birthday) throws BirthdayException {
        pattern = Pattern.compile(BirthdayRegex);
        matcher = pattern.matcher(birthday);
        if (!matcher.matches()) {
            throw new BirthdayException("Lỗi định dạng.");
        } else {
            return true;
        }
    }
}
