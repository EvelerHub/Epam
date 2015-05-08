package ua.nure.manko.Practice1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Eveler on 07.05.2015.
 */
public class Main {

    public static boolean validator(String testString) {
        Pattern number = Pattern.compile(".*\\d.*");
        Pattern lowCase = Pattern.compile(".*[a-z].*");
        Pattern upperCase = Pattern.compile(".*[A-Z].*");
        Pattern notCharOrNumber = Pattern.compile(".*\\W.*"); // \W mean [^a-zA-Z0-9]

        Matcher n = number.matcher(testString);
        Matcher l = lowCase.matcher(testString);
        Matcher u = upperCase.matcher(testString);
        Matcher ncn = notCharOrNumber.matcher(testString);

        boolean len = testString.length() >= 8;

        return len && !ncn.matches() && n.matches() && l.matches() && u.matches();
    }

    public static void main(String[] args) {
        System.out.println(validator("oddS14dddSasd"));

    }
}
