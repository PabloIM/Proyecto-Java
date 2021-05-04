import java.util.Scanner;
public class ventas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido a ventas");
        System.out.println();
        System.out.println("Que hacer:");
        System.out.println("1 = hacer un ticket");
        System.out.println("2 = salir");
        int seleccion = entrada.nextInt();
        if (seleccion == 1){
            System.out.println("Introduce valor por valor el producto que desea añadir" +
                    "y presione 'f' si desea terminar");
            String [][] ticket = new String[100][100];
            int x = 0;
            int y = 0;
            while(ticket[x][y] != 'f'){
                System.out.print("Introduce el código del producto: ");
                ticket[x][y]=entrada.next();
                x = x+0;
                y = y+1;
            }
        }
        else{
            //Volver al menú inicial.
        }
    }
}