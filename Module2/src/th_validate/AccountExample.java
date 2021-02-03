package th_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String Account_regex=  "^[_a-z0-9]{6,}$";
    public AccountExample(){
    }
    public boolean Validatea(String regex){
        Pattern pattern= Pattern.compile(Account_regex);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}