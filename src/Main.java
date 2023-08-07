import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("TV LED", 1290.99, 0);
        Product p2 = new Product("Video Game Chair", 350.50, 0);
        Product p3 = new Product("Iphone X", 900.00, 0);
        Product p4 = new Product("Samsung Galaxy 9", 850.00, 0);

        System.out.print("Digite quantas " + p1.getNome() + " quer comprar:");
        int q1 = sc.nextInt();
        p1.setQuantidade(q1);
        System.out.print("Digite quantas " + p2.getNome() + " quer comprar:");
        int q2 = sc.nextInt();
        p2.setQuantidade(q2);
        System.out.print("Digite quantas " + p3.getNome() + " quer comprar:");
        int q3 = sc.nextInt();
        p3.setQuantidade(q3);
        System.out.print("Digite quantas " + p4.getNome() + " quer comprar:");
        int q4 = sc.nextInt();
        p4.setQuantidade(q4);


        String[] lines = new String[] {p1.getNome(), String.valueOf(p1.getPreco()), String.valueOf(p1.getQuantidade())};
        /// ele também cria uma pasta se não tiver nenhuma
        String path = "C:\\Users\\Bruno\\OneDrive\\Área de Trabalho\\pedido.csv";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

