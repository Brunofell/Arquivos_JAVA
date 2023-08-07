import java.io.IOException;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("C:\\Users\\Bruno\\OneDrive\\Área de Trabalho\\teste.txt");

        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }

        }
    }
}