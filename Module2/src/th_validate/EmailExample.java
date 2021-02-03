package th_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class EmailExample {
        private static Pattern pattern;
        private Matcher matcher;

        public static final String Email= "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        public EmailExample(){
            pattern= Pattern.compile(Email);
        }
        public boolean Validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }


