import java.util.Scanner;
public class Ventas {
    public static void main(String[]args) {
        ticket();
    }

    public static void ticket() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a ventas");
        System.out.println();
        System.out.println("Que hacer:");
        System.out.println("1 = hacer un ticket");
        System.out.println("2 = salir");
        int seleccion = entrada.nextInt();
        if (seleccion == 1){
            System.out.println();
            System.out.println("Cuántos productos quieres añadir? ");
            int productos = entrada.nextInt();
            String [][] ticket = new String[2][productos+1];
            int x = 0;
            int y = 1;
            ticket[0][0]="[Código] ";
            ticket[1][0]="[Cantidad]";
            System.out.println();
            for (int n=0; n<productos; n++ ) {
                añadirProducto(ticket,x,y);
                y++;
            }
            System.out.println();
            mostrarTicket(ticket,x,y,productos+1);
        }
        else{
            //Volver al menú inicial.
        }
    }
    public static void añadirProducto(String[][] ticket,int x, int y) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el código del producto: ");
        ticket[x][y] = entrada.next();
        System.out.print("Introduce la cantidad: ");
        ticket[x+1][y] = entrada.next();
    }
    public static void mostrarTicket(String[][] ticket,int x, int y,int productos){
        System.out.println(ticket[0][0]+ticket[1][0]);
        for (y=0; y<productos-1; y++ ) {
            for (x=0; x < 2; x++) {
                System.out.print(" ["+ticket[x][y+1]+"] ");
                System.out.print("      ");
            }
            System.out.println();
        }
    }
    public static void carrito(String [][] datosStock){

    }
}