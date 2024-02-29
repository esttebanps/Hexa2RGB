package esttebanps.converter;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isLetter(char code) {
        return Character.isLetter(code);
    }

    public static boolean hexaValidate(String code) {
        return code.matches("^#\\p{XDigit}{6}$");
    }

    // rgb(90,131,17)
    public static boolean rgbValidate(String code) {
        return code.matches("rgb\\(\\s*((?:[0-2]?[0-9])?[0-9])\\s*,\\s*((?:[0-2]?[0-9])?[0-9])\\s*,\\s*((?:[0-2]?[0-9])?[0-9])\\s*\\)$");
    }
}

