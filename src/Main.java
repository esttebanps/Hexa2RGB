import java.util.Scanner;

public class Main {
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
            String rgb = Hexa2RGB.converter(color, Hexa2RGB.getMyLetters());
            System.out.println("El codigo RGB para el Hexadecimal " + color+" es: " + rgb);
        } else if(type == 2){
            Scanner scRGB = new Scanner(System.in);
            System.out.println("Ingresa el codigo RGB:");
            String color = scRGB.nextLine();
            String hexa = RGB2Hexa.converter(color);
            System.out.println("El codigo Hexadecimal para el RGB " + color + " es: " + hexa);
        }
    }
}

// #5A8311
// rgb(90,131,17)
