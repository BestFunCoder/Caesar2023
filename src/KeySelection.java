import java.util.Scanner;

public class KeySelection {
    private final String SELECT_NUMBER_KEY = ("""
                Оберіть ключ:
                1 - Ключ №1.
                2 - Ключ №2.
                3 - Ключ №3.
                """);
    private final String YOUR_CHOICE = "Ви обрали ключ №";
    private final String ERROR_CHOICE = "Ви помилились у виборі, спробуйте ще раз.";
    int yourKey;
    int yourShiftKey;
    int yourShiftKey1 = 3;
    int yourShiftKey2 = 5;
    int yourShiftKey3 = 7;

    public int selectKey() {
        System.out.println(SELECT_NUMBER_KEY);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            switch (yourKey=scanner.nextInt()) {
                case 1 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey1;
                }
                case 2 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey2;
                }
                case 3 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey3;
                }
                default -> {
                    System.out.println(ERROR_CHOICE);
                    selectKey();
                }
            }
        }
        return yourShiftKey;
    }
}