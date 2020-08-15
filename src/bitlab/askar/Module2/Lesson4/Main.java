package bitlab.askar.Module2.Lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> products = readProducts();

        while (true){

            System.out.println("[1] Add product");
            System.out.println("[2] read product");
            System.out.println("[3] exit");

            int choice = in.nextInt();

            if (choice==1){
                String product = in.next();
                products.add(product);
                writeProduct(products);
            }else if (choice==2){
                System.out.println(products.toString());
            }else {
                break;
            }
        }
    }


    public static void writeProduct(ArrayList<String> products){
        try {

            FileWriter fileWriter = new FileWriter("input.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);

            for (String s:products){
                bw.write(s+"\n");
            }

            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  static ArrayList<String> readProducts(){

        ArrayList<String > products = new ArrayList<>();

        try {

            FileReader fileReader = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fileReader);

            String s;
            while ((s = br.readLine()) != null){
                products.add(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }
}
