import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String path = sc.nextLine();

        File sourceFile = new File(path);
        String folderString = sourceFile.getParent();

        boolean success = new File(folderString + "/out").mkdir();

        String targetFileStr = folderString + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String lineCSV = br.readLine();

            while (lineCSV != null){


                String[] fields = lineCSV.split(";");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                lineCSV = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for (Product item : list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                }

                System.out.println(targetFileStr + " created");

            } catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}