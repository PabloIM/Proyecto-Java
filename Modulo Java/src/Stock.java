import java.util.Scanner;

public class Stock {
    public static void mainStock(String[][] datosStock, int numero) {
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
        for (int columna=0; columna< matriz.length; columna++){
            for (int fila=0; fila< matriz[columna].length; fila++){
                System.out.println("Introduce el código del producto");
                matriz[fila][columna] = entrada.next();
                System.out.println("Introduce el nombre del producto");
                matriz[fila][columna] = entrada.next();
                System.out.println("Introduce las unidades del producto");
                matriz[fila][columna] = entrada.next();
            }
        }
    }

    public static void consultar(String [][] matriz) {
        for(int m=0;m<matriz.length;m++){
            for(int t=0;t<matriz[m].length;t++){
                System.out.print(" "+matriz[m][t]);
            }
            System.out.println();
        }
        return;
    }

}