package esttebanps.converter;

import java.util.regex.Pattern;

public class Validator {
    public static boolean hexaValidate(String code){
        // Pattern patron = Pattern.compile("^#\\p{XDigit}{6}$");
        return code.matches("^#\\p{XDigit}{6}$");
    }
}

