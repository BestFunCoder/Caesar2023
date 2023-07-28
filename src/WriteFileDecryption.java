import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteFileDecryption {
    String fileName;
    String fullNameOutFile;
    final String DIRECTORY_TO_SAVE_FILE = "\n- Новий файл буде збережено до директорії - ";
    final String ENTER_NAME_FILE = """
                     
            = Введіть назву для розшифрованого файлу =
            ( формат файлу має мати вигляд ***.txt )
            """;
    final String ERROR_ENTER_NAME_FILE = "- Ви зробили помилку в написанні назви файлу. Спробуйте ще раз. -";
    final String SAVED_SUCCESSFULLY = "\n- Вміст обробленого файлу було успішно збережено в файл. -";
    final String ERROR_SAVE = "\n- Виникла помилка при записі в файл. -\n";
    String FILE_NAME_EXIST = "\n- Файл з таким ім'ям вже існує. Спробуйте ще раз. -";
    ArrayList<Character> arrayListWriteFile;
    final String DIRECTORY_FOR_SAVE_FILE = "C:\\Caesar\\DecryptionFiles\\";

    public WriteFileDecryption(ArrayList<Character> arrayListWriteFile) {
        this.arrayListWriteFile = arrayListWriteFile;
    }

    public void write() {
        selectDirectoryFromWrite();
        enterNameFile();
        writeArrayListToFile();
    }

    public void selectDirectoryFromWrite() {
        Path dirForSave = Paths.get(DIRECTORY_FOR_SAVE_FILE);
        if (Files.notExists(dirForSave)) {
            try {
                Files.createDirectories(dirForSave);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(DIRECTORY_TO_SAVE_FILE + DIRECTORY_FOR_SAVE_FILE);
    }

    public void enterNameFile() {
        while (fullNameOutFile == null) {
            fileName = null;
            Scanner scanner = new Scanner(System.in);
            System.out.println(ENTER_NAME_FILE);
            if (scanner.hasNextLine()) {
                fileName = scanner.nextLine();
                if (fileName != null && fileName.endsWith(".txt")) {
                    fullNameOutFile = DIRECTORY_FOR_SAVE_FILE + fileName;
                    if (Files.exists(Path.of(fullNameOutFile))) {
                        System.out.println(FILE_NAME_EXIST);
                    }
                }
            } else {
                System.out.println(ERROR_ENTER_NAME_FILE);
            }
        }
    }

    public void writeArrayListToFile() {
        try {
            FileWriter fileWriterDecryption = new FileWriter(fullNameOutFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriterDecryption);

            for (Character character : arrayListWriteFile) {
                bufferedWriter.write(character);
            }

            bufferedWriter.close();
            fileWriterDecryption.close();
            System.out.println(SAVED_SUCCESSFULLY);
            System.out.println(fullNameOutFile);
            System.out.println();

        } catch (IOException e) {
            System.out.println(ERROR_SAVE);
            e.printStackTrace();
        }
    }
}