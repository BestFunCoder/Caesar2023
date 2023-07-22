/*import java.util.Scanner;

public class EncryptionMethod extends ChoiceOfAction {

    private static final String METHOD_BRUTEFORCE = "\n- Ви обрали метод з вибором ключа. -\n";
    private static final String METHOD_WITH_KEY = "\n- Ви обрали метод Brute Force. -\n";
    private static final String EXIT_MINE_MENU = "\n- Ви обрали вихід в головне меню програми. -\n";
    private static final String  ERROR_SELECT = "\n- Ви зробили помилковий вибір, спробуйте ще раз. -\n";
    private static final String EXIT_SELECT = "\n- Ви обрали вихід з програми. Допобачення!" -;

    public int selectEncryptionMethod() {
        System.out.println("""
                Оберіть метод розшифрування:
                ( для цього введіть відповідну цифру і натисніть Enter )
                """);
        System.out.println("""
                1 - Метод з вибором ключа.
                2 - Метод Brute Force.
                3 - Вихід в головне меню.
                4 - Вихід з програми.""");

        int encryptMeth = 0;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            encryptMeth = scanner.nextInt();
            switch (encryptMeth){
                case 1 -> System.out.println(METHOD_BRUTEFORCE);
                case 2 -> System.out.println(METHOD_WITH_KEY);
                case 3 -> System.out.println(EXIT_MINE_MENU);
                case 4 -> System.out.println(EXIT_SELECT);
                default -> {
                    System.out.println(ERROR_SELECT);
                    selectEncryptionMethod();
                }
            }
        }
        return encryptMeth;
    }
}*/