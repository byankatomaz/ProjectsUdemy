import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[] {"Oi xoxolis, hoje tem feedback"};

        String path = "C:\\Users\\mob7ca\\Desktop\\ProjectsUdemy\\UdemyJava\\escrevendoArquivo\\escrevendo.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}