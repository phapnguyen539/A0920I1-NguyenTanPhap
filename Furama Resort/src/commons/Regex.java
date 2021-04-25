package commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String regexall="^[0-9]\\d*";

 private static Pattern pattern;
 private static Matcher matcher;

    public static boolean validateall(String all) {
        pattern = Pattern.compile(regexall);
        matcher = pattern.matcher(all);
        return matcher.matches();
    }
}
