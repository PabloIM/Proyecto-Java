import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        File file=new File("C:\\Users\\Pablo Ibañez\\IdeaProjects\\Proyecto-Java\\Modulo Java\\src\\datosStock.txt");
        int n=0;
        String Mat[][]= new String[3][5];
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] values = line.split(",");
                for(int i=0;i<values.length;i++){
                    Mat[n][i]=values[i];
                }
                n++;
            }
            sc.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("No se encuentra el archivo");
            System.out.println(ex);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Bienvenidos al sistema de gestión del Mercatrona");
        System.out.println("Seleccione la opción que desea escoger: ");
        System.out.println();
        System.out.println("1. Stock");
        System.out.println("2. Ventas");
        System.out.println("3. Salir");
        int opcion = entrada.nextInt();

        while (opcion == 1 || opcion == 2){
            if (opcion == 1){
                int numero = 0;
                Stock.mainStock(Mat, numero);
            }

            else if (opcion == 2){
                Ventas.ticket();
            }
            else if (opcion == 3){
                System.exit(0);
            }

            else {
                System.out.println("Error, el valor introducido no es valido");
            }

        }

    }
}