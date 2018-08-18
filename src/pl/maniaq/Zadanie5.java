package pl.maniaq;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1l, "Pablo", "escabo", 21));
        students.add(new Student(2l, "Joanna", "Blas", 25));
        students.add(new Student(3l, "Max", "Maximillian", 31));
        students.add(new Student(4l, "Johny", "Bravo", 18));

        System.out.println("Podaj nazwę pliku, do którego chcesz zapisac studentów ");
        final String fileName = scanner.next();

        PrintWriter pw = new PrintWriter(fileName);

        for(Student student : students) {
            pw.write(student.toString() + "\n");
        }

        pw.close();



    }
}
