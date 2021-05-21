import java.util.Scanner;

public class Stock {
    public static void mainStock(String[][] datosStock) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3){
            System.out.println();
            System.out.println("Que deseas hacer?");
            System.out.println();
            System.out.println("1. Añadir producto");
            System.out.println("2. Consultar");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                añadir(datosStock);
            }
            else if (opcion == 2) {
                consultar(datosStock);
            }
            else if (opcion == 3) {
                volver();
            }
            else {
                System.out.println("Error, el numero introducido no es valido.");
            }
        }
    }

    public static void volver(){
        String [] inicio = {};
        Main.main(inicio);
    }

    public static void añadir(String [][] matriz) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos productos deseas añadir?");
        int numero = entrada.nextInt();
        for (int columna=0; columna< numero; columna++){
            for (int fila=0; fila< matriz[numero].length; fila++){
                if (fila == 0){
                    System.out.println("Introduce el codigo del producto");
                    matriz[columna][fila] = entrada.next();
                }
                else if (fila == 1){
                    System.out.println("Introduce el nombre del producto");
                    matriz[columna][fila] = entrada.next();
                }
                else if (fila ==2){
                    System.out.println("Introduce el precio del producto");
                    matriz[columna][fila] = entrada.next();
                }
            }
        }
    }

    public static void consultar(String [][] matriz) {
        for(int m=0;m<matriz.length;m++){
            for(int t=0;t<matriz[m].length;t++){
                if (matriz[m][t] != null) {
                    System.out.println();
                    System.out.print(" " + matriz[m][t]);
                }
                else {
                    return;
                }
            }
            if (matriz[m] == null){
                return;
            }
            System.out.println();
        } return;
    }
}