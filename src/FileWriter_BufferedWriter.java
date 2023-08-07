import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
///Para escrever em um arquivo
public class FileWriter_BufferedWriter {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        /// ele também cria uma pasta se não tiver nenhuma
        String path = "C:\\Users\\Bruno\\OneDrive\\Área de Trabalho\\oiee.txt"; ///
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

