package esttebanps.converter;

import java.util.InputMismatchException;
import java.util.Scanner;

import static esttebanps.converter.Validator.hexaValidate;


public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void Run() {
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

            if (choice < 1 || choice > 2) {
                System.out.println("Opción inválida. Ingresa 1 o 2:");
            }
        } while (choice < 1 || choice > 2);

        switch (choice) {
            case 1:
                String color;
                boolean valid = true;

                do {
                    if (valid) {
                        System.out.println("Ingresa el color:");
                        valid = false;
                    }
                    color = sc.nextLine();

                } while (!hexaValidate(color));

                String rgb = Hexa2RGB.converter(color, Hexa2RGB.getMyLetters());
                System.out.println("El codigo RGB para el Hexadecimal " + color+" es: " + rgb);

            case 2:
        }

    }
}
