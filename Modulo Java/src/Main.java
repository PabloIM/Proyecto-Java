import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Javi\\IdeaProjects\\Proyecto-Java\\Modulo Java\\src\\datosStock.txt");
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

        System.out.println();

        for(int m=0;m<Mat.length;m++){
            for(int t=0;t<Mat[m].length;t++){
                System.out.print(" "+Mat[m][t]);
            }
            System.out.println();
        }

    }
}