package notebook;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NoteProcessor {
    public static void processAndWriteToFile(String note) {
        String formattedNote = formatNoteWithTimestamp(note);

        try (FileWriter fileWriter = new FileWriter("notes.txt", true)) {
            fileWriter.write(formattedNote + "\n");
            System.out.println("Дозапись в файл: " + formattedNote);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String formatNoteWithTimestamp(String note) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String timestamp = dateFormat.format(new Date());

        return timestamp + " -> " + note;
    }
}



