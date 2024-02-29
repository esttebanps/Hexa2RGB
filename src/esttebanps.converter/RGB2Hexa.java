package esttebanps.converter;

import java.util.ArrayList;

public class RGB2Hexa extends ConverterColor {
    static String converter(String code) {
        // rgb(19,255,19)
        code = code.substring(4, code.length() - 1);
        String[] values = code.split(",");
        ArrayList<String> HexaCode = new ArrayList<>();

        for (String value : values) {
            int parseValue = Integer.parseInt(value);
            String hexaValue = Integer.toHexString(parseValue);
            HexaCode.add(hexaValue);
        }
        return "#" + HexaCode.get(0).toUpperCase() + HexaCode.get(1).toUpperCase() + HexaCode.get(2).toUpperCase();
    }
}
