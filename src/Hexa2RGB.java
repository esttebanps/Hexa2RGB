import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Hexa2RGB {
    public static String myLetters = "ABCDEF";

    public static String getMyLetters() {
        return myLetters;
    }

    static boolean isLetter(char hexaCodeLetter) {
        return Character.isLetter(hexaCodeLetter);
    }

    static String converter2rgb(String hexaCode, String myLetters) {
        hexaCode = hexaCode.substring(1,7);
        List<Integer> RGBCode = new ArrayList<>();

        for (int i = 0; i < hexaCode.length() - 1; i += 2) {
            List<Integer> numbers = new ArrayList<>();
            String pair = hexaCode.substring(i, i + 2);
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

    static String converter2hexadecimal(String rgbCode){
        // rgb(19,255,19)
        rgbCode = rgbCode.substring(4, rgbCode.length()-1);
        String[] values = rgbCode.split(",");
        return Arrays.toString(values);
    };

    public static void main(String[] args) {
        Scanner scType = new Scanner(System.in);
        System.out.println("Ingresa el tipo de conversion:");
        System.out.println("1. Convertir de Hexadecimal a RGB");
        System.out.println("2. Convertir de RGB a Hexadecimal");
        int type = scType.nextInt();
        if (type == 1){
            Scanner scHexa = new Scanner(System.in);
            System.out.println("Ingresa el codigo Hexadecimal:");
            String color = scHexa.nextLine();
            String rgb = Hexa2RGB.converter2rgb(color, Hexa2RGB.getMyLetters());
            System.out.println("El codigo RGB para el Hexadecimal "+color+" es:");
            System.out.println(rgb);
        } else if(type == 2){
            String hexa = Hexa2RGB.converter2hexadecimal("rgb(19,255,19)");
            System.out.println(hexa);
            System.out.println("Lo siento, esta opcion esta en desarrollo :(");
        }
    }
}
// #5A8311
