package esttebanps.converter;

import java.util.InputMismatchException;
import java.util.Scanner;

import static esttebanps.converter.Validator.*;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void run() {
        int choice = 0;

        do {
            try {
                System.out.println("Ingresa el tipo de conversión:");
                System.out.println("1. Convertir de Hexadecimal a RGB");
                System.out.println("2. Convertir de RGB a Hexadecimal");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
            }
            isOptionValid(choice);
        } while (choice < 1 || choice > 2);

        switch (choice) {
            case 1:
                String color;
                boolean valid = true;

                do {
                    if (valid) {
                        System.out.println("Ingresa el hexColor:");
                        valid = false;
                    }
                    color = sc.nextLine().toUpperCase();

                } while (!hexaValidate(color));

                String rgb = Hexa2RGB.converter(color, Hexa2RGB.getMyLetters());
                System.out.println("El codigo RGB para el Hexadecimal " + color + " es: " + rgb);

            case 2:
                valid = true;
                do {
                    if (valid) {
                        System.out.println("Ingresa el rgb:");
                        valid = false;
                    }
                    color = sc.nextLine().toLowerCase();

                } while (!rgbValidate(color));


                String hexa = RGB2Hexa.converter(color);
                System.out.println("El codigo Hexadecimal para el RGB " + color + " es: " + hexa);
        }

    }
}
