package pl.maniaq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku, który chcesz wczytać ");
        final String fileName = scanner.next();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        List<String> names = new ArrayList<String>();

        String read = reader.readLine();
        while(read != null) {
            names.add(read);
            read = reader.readLine();
        }

        reader.close();

        System.out.println("Znaleziono imion: " + names.size());
        for(String name : names) {
            System.out.println(name);
        }


    }
}
