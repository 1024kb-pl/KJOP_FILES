package pl.maniaq;

import java.io.*;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku, który chcesz wczytać ");
        final String fileName = scanner.next();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // wykorzystanie Integer.parseInt - do zmiany Stringa na liczbę!
        final int arraySize = Integer.parseInt(reader.readLine());

        int [] numbers = new int[arraySize];

        for(int i=0;i<arraySize; i++) {
            // wykorzystanie Integer.parseInt - do zmiany Stringa na liczbę!
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }

        System.out.println("Suma liczb z pliku to: " + sum);

    }
}
