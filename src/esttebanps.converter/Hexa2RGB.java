package esttebanps.converter;
import java.util.ArrayList;

import static esttebanps.converter.Validator.RgbValidate;

public class Hexa2RGB extends ConverterColor {
    public static boolean isLetter(char hexaCodeLetter) {
        return Character.isLetter(hexaCodeLetter);
    }

    public static String converter(String code, String myLetters) {
        code = code.substring(1,7);

        ArrayList<Integer> RGBCode = new ArrayList<>();

        for (int i = 0; i < code.length() - 1; i += 2) {
            ArrayList<Integer> numbers = new ArrayList<>();
            String pair = code.substring(i, i + 2);
            //System.out.println(pair);

            for (int l = 0; l < pair.length(); l++) {
                int value = Hexa2RGB.isLetter(pair.charAt(l))
                        ? (myLetters.indexOf(pair.charAt(l)) + 10) * 16
                        : Character.getNumericValue(pair.charAt(l)) * 16;
                numbers.add(value);
            }

            int RGB_value = numbers.get(0) + (numbers.get(1) / 16);
            RGBCode.add(RGB_value);
        }
        return "rgb(" + RGBCode.get(0) + "," + RGBCode.get(1) + "," + RGBCode.get(2) + ")";
    }
}

