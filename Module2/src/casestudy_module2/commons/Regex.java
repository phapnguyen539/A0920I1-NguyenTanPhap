package casestudy_module2.commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String idRegex="SV(VL|HO|RO)-\\d{4}";
    private static final String nameRegex="^[A-Z]{1}[a-z]*";
    private static final String dateRegex="^\\d{2}\\/\\d{2}\\/\\d{4}$";
    private static final String numRegex="^[1-9]\\d*$";
    private static final String servicesRegex="^massage|karaoke|food|drink|car$";
    private static final String areaPoolRegex="^([3-9]\\d|\\d{3,})$";
    private static final String maxPeopleRegex="^[1-9]|[1]\\d$";
    private static Pattern pattern;
    private static Matcher matcher;
    public static boolean validateid(String id) {
        pattern = Pattern.compile(idRegex);
        matcher = pattern.matcher(id);
      return matcher.matches();
    }
    public static boolean validateName(String name){
        pattern=Pattern.compile(nameRegex);
        matcher=pattern.matcher(name);
       return matcher.matches();
    }
    public static boolean validateDate(String date){
        pattern=Pattern.compile(dateRegex);
        matcher=pattern.matcher(date);
       return matcher.matches();
    }
    public static boolean validateServices(String service){
        pattern=Pattern.compile(servicesRegex);
            matcher= pattern.matcher(service);
       return matcher.matches();
    }
    public static boolean validateAreaPool(String area){
        pattern=Pattern.compile(areaPoolRegex);
        matcher=pattern.matcher(area);
       return matcher.matches();
    }
    public static boolean validateMaxPeople(String maxpeople){
        pattern=Pattern.compile(maxPeopleRegex);
        matcher=pattern.matcher(maxpeople);
        return matcher.matches();
    }
    public static boolean validateRentCost(String rentCost){
        pattern = Pattern.compile(numRegex);
        matcher = pattern.matcher(rentCost);
        return matcher.matches();
}
}