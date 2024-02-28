package esttebanps.converter;

import java.util.Scanner;

import static esttebanps.converter.Validator.RgbValidate;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void Run() {
        int choice;

        do {
            System.out.println("Ingresa el tipo de conversion:");
            System.out.println("1. Convertir de Hexadecimal a RGB");
            System.out.println("2. Convertir de RGB a Hexadecimal");
            choice = sc.nextInt();
            if (choice < 1 || choice > 2) {
                System.out.println("Opción inválida. Ingresa 1 o 2:");
            }
        } while (choice < 1 || choice > 2);

        switch (choice){
            case 1:

                String color;
                System.out.println("Ingresa el codigo Hexadecimal:");
                do {
                    color = sc.nextLine();
                } while (!RgbValidate(color));

            case 2:
        }

    }
}
