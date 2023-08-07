import java.io.File;
import java.util.Scanner;
public class Info_caminho_arquivo  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        System.out.println("getPath: " + path.getPath()); //nome do arquivo
        System.out.println("getParent: " + path.getParent()); // so o caminho sem o nome dop arquivo
        System.out.println("getName: " + path.getName()); // tudo
        sc.close();
    }
}

