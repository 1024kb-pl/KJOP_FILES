package pl.maniaq;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile imion chcesz wczytać: ");
        final int arraySize = scanner.nextInt();

        String [] names = new String[arraySize];

        for(int i=0;i<arraySize;i++) {
            System.out.println("Podaj imię numer: " + i);
            names[i] = scanner.next();
        }

        PrintWriter pw  = new PrintWriter("imiona.txt");
        for(String name: names) {
            pw.write("Podano imię: " + name + "\n");
        }
        pw.close();

    }
}
