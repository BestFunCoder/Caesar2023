import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteFile {
    String fileName;
    String fullNameOutFile;
    final String DIRECTORY_TO_SAVE_FILE = "- Новий файл буде збережено до директорії - ";
    final String ENTER_NAME_FILE = """
         = Введіть назву для шифрованого файлу =
         ( формат файлу має мати вигляд ***.txt )
         """;
    final String ERROR_ENTER_NAME_FILE = "- Ви зробили помилку в написанні назви файлу. Спробуйте ще раз. -";
    final String SAVED_SUCCESSFULLY = "\n- Вміст обробленого файлу було успішно збережено в файл. -";
    final String ERROR_SAVE = "\n- Виникла помилка при записі в файл. -\n";
    final String FILE_NAME_EXIST = "\n- Файл з таким ім'ям вже існує. Спробуйте ще раз. -";
    ArrayList<Character> arrayListWriteFile;

    String directoryForSaveFile = "C:\\Caesar\\EncryptionFiles\\";

    public WriteFile(ArrayList<Character> arrayListWriteFile) {
        this.arrayListWriteFile = arrayListWriteFile;
    }


    public void selectDirectoryFromWrite() {

        Path dirForSave = Paths.get(directoryForSaveFile);
        if(!Files.exists(dirForSave)){
            try {
                Files.createDirectories(dirForSave);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(DIRECTORY_TO_SAVE_FILE + directoryForSaveFile);
        enterNameFile();
    }
    public void enterNameFile(){
        System.out.println(ENTER_NAME_FILE);
        fileName = null;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()) {
            fileName = scanner.nextLine();
            System.out.println(fileName);
            if (fileName != null && fileName.endsWith(".txt")){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(directoryForSaveFile);
                stringBuilder.append(fileName);
                fullNameOutFile = stringBuilder.toString();
                if(Files.exists(Path.of(fullNameOutFile))){
                    System.out.println(FILE_NAME_EXIST);
                    //fullNameOutFile = null;
                    enterNameFile();
                }
            }
            else {
                System.out.println(ERROR_ENTER_NAME_FILE);
                enterNameFile();
            }
        }
        writeArrayListToFile();
    }

    public void writeArrayListToFile() {
        try {
            FileWriter fileWriter = new FileWriter(fullNameOutFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Character character : arrayListWriteFile) {
                bufferedWriter.write(character);
            }

            bufferedWriter.close();
            fileWriter.close();
            System.out.println(SAVED_SUCCESSFULLY);
            System.out.println(fullNameOutFile);
            System.out.println();

        } catch (IOException e) {
            System.out.println(ERROR_SAVE);
            e.printStackTrace();
        }
    }
}