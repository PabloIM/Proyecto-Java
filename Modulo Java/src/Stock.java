import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Que deseas hacer?");
        System.out.println();
        System.out.println("1. Añadir producto");
        System.out.println("2. Consultar");
        System.out.println("3. Salir");

        String [][] stock = new String[100][100];
        String seleccion = entrada.next(stock);
    }

    public static void añadir(String [][] stock){

    }
}
