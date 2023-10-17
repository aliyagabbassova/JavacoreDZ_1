package org.example;
import notebook.NoteProcessor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String note = scanner.nextLine();

        NoteProcessor.processAndWriteToFile(note);
    }
}
