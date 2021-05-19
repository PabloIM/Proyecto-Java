import java.util.Scanner;
public class Ventas {
    public static void main(String[] args) {
        ticket();
    }
    public static void ticket(){
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
            String[][] ticket = new String[productos+1][2];
            for(int n=0;n<productos;n++){
                añadirProducto(ticket,productos,n);
            }
            mostrarTicket(ticket,productos);

        }
        else if (seleccion == 2){
            String[] inicio={};
            Main.main(inicio);
        }
        else{
            System.out.println("Escribe un número válido.");
        }
    }
    public static void añadirProducto(String[][] ticket, int productos, int n){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el código del producto: ");
        ticket[n][0]=entrada.next();
        System.out.print("Introduce la cantidad del producto: ");
        ticket[n][1]=entrada.next();
    }
    public static void mostrarTicket(String[][]ticket, int productos){
        System.out.print("[Código]");
        System.out.println("[Cantidad]");
        for(int n=0;n<ticket.length;n++){
            for(int m=0;m<ticket[n].length;m++){
                System.out.print("["+ticket[n][m]+"]    ");
            }
            System.out.println();
        }
    }
}