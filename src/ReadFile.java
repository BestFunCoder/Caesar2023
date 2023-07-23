import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFile {

    private final String SELECTION_ERROR = "\n- Ви ввели недійсний шлях до файлу. -\n" +
            "1 - Ввести адресу ще раз.\n" +
            "2 - Вийти в головне меню.";
    private final int MENU_ITEM1 = 1;
    private final int MENU_ITEM2 = 2;
    private final String PROMPT_TO_SELECT_FILE = "- Даний файл наявний та має правильне розширення. -";
    private final String ENTER_TO_FILE_PATCH = "= Введіть шлях до файлу (розширення .txt): =";
    private final String NOTHING_ENTERED = "- Ви впевненні, що поле введення не пусте? -";
    public ArrayList<Character> arrayCharSourceFile = new ArrayList<>();



    public ArrayList<Character> readFileToChar() {
        Path path = null;
        while(path == null) {
            System.out.println(ENTER_TO_FILE_PATCH);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                path = Path.of(scanner.nextLine());

            } else {
                System.out.println(NOTHING_ENTERED);
                readFileToChar();
            }

        }

        if (Files.exists(path) && path.toString().endsWith(".txt")) {
            System.out.println(PROMPT_TO_SELECT_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    char[] chars = line.toCharArray();
                    for (char c : chars) {
                        arrayCharSourceFile.add(c);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            menuEnteredIncorrectly();
        }
        return arrayCharSourceFile;
    }
    public void menuEnteredIncorrectly(){
        System.out.println(SELECTION_ERROR);
        Scanner scanner = new Scanner(System.in);
        int i=1;
        if (scanner.hasNextInt()){
            i = scanner.nextInt();
        }
        switch (i) {
            case MENU_ITEM1 -> readFileToChar();
            case MENU_ITEM2 -> new Menu().starting();
            default -> menuEnteredIncorrectly();
        }
    }
}