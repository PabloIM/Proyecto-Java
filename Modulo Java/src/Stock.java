import java.util.Scanner;

public class Stock {
    public static void mainStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que deseas hacer?");
        System.out.println();
        System.out.println("1. Añadir producto");
        System.out.println("2. Consultar");
        System.out.println("3. Salir");
        int opcion = entrada.nextInt();

        if (opcion == 1) {
            añadir();
        }
        if (opcion == 2) {
            consultar();
        }

        if (opcion == 3) {

        }
        while (opcion != 1 && opcion != 2 && opcion != 3) {
            System.out.println("Te has equivocado, introduce un numero de nuevo");
            opcion = entrada.nextInt();
        }
    }

    public static void añadir() {
        System.out.println("Introduce el código del producto");

    }

    public static void consultar() {
        Scanner entrada = new Scanner(System.in);
        String seleccion1 = "";
        System.out.println("Probando");
        while (!seleccion1.equals("-1")) {
            System.out.println(seleccion1);
            seleccion1 = entrada.nextLine();
        }
    }

}