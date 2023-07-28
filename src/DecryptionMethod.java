import java.util.ArrayList;

public class DecryptionMethod extends AbstractActionSelectionMenu {

    ArrayList<Character> decryptionFile;

    @Override
    public String getMenuItems() {
        return """
                1 - Метод з вибором ключа.
                2 - Метод Brute Force.
                3 - Вихід в головне меню.
                4 - Вихід з програми.
                """;
    }

    @Override
    public String getOfferOfChoice() {
        return """
                = Оберіть метод розшифрування.
                Введіть відповідну цифру і натисніть Enter =
                """;
    }

    @Override
    public void executingMenuItem1() {
        System.out.println("\n- Ви обрали метод з вибором ключа. -\n");
        KeySelectionDecryption keySelectionDecryption = new KeySelectionDecryption();
        keySelectionDecryption.operationSelection();
    }

    @Override
    public void executingMenuItem2() {
        System.out.println("\n- Ви обрали метод Brute Force. -\n");
        bruteKey1();
        bruteKey2();
        bruteKey3();
        System.out.println("- Відповідного ключа не знайдено. -");
        new EndMenu().operationSelection();
    }

    @Override
    public void executingMenuItem3() {
        new Menu().starting();
    }

    @Override
    public void executingMenuItem4() {
        System.exit(0);
    }

    public void bruteKey1() {
        Key1 key1 = new Key1();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key1.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }

    public void bruteKey2() {
        Key2 key2 = new Key2();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key2.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }

    public void bruteKey3() {
        Key3 key3 = new Key3();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key3.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }
}