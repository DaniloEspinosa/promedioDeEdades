import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        String consigna = """
                Vamos a calcular el promedio de edades
                Deberas introducir la cantidad de personas
                y luego la edad de cada una.
                """;

        System.out.println(consigna);
        System.out.println("Introduce la cantidad de personas");
        int cantidad = input.nextInt();
        int total = 0;
        int divisor = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce una edad");
            int edad = input.nextInt();
            if (edad >= 0 && edad <= 120) {
                total += edad;
                divisor++;
            } else {
                System.out.println(STR. "La edad de la persona #\{ i + 1 } no es válida." );
            }
        }

        int promedio = total / divisor;

        System.out.println("------------------------------\n");

        System.out.println(STR. "La cantidad ingresada de personas es : \{ cantidad }" );
        System.out.println(STR. "Has ingresado correctamente la edad de \{ divisor } personas\n" );
        System.out.println(STR. "--El promedio de edades de estas \{ divisor } personas es '\{ promedio }'--" );
    }
}