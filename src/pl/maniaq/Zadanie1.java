package pl.maniaq;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile liczb chcesz wczytać: ");
        final int arraySize = scanner.nextInt();

        int [] numbers = new int[arraySize];

        for(int i=0;i<arraySize;i++) {
            System.out.println("Podaj liczbę numer: " + i);
            numbers[i] = scanner.nextInt();
        }

        PrintWriter pw  = new PrintWriter("liczby.txt");
        for(int number : numbers) {
            pw.write(number + "\n");
        }
        pw.close();

    }
}
