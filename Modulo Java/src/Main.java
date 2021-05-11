import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al gestor de datos del supermercado Mercadona");
        System.out.println();
        System.out.println("Que hacer:");
        System.out.println("1 = control de stock");
        System.out.println("2 = ventas");
        int seleccion = entrada.nextInt();
        System.out.println();
        if (seleccion == 1){
            Stock.mainStock();
        }
        else if (seleccion == 2){
            Ventas.ticket();
        }
        else{
            System.exit(0);
        }
    }
}