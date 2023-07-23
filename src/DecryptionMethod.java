import java.util.ArrayList;

public class DecryptionMethod extends  ChoiceOfAction {


    private final String METHOD_WITH_KEY = "\n- Ви обрали метод з вибором ключа. -\n";
    private final String METHOD_BRUTEFORCE = "\n- Ви обрали метод Brute Force. -\n";
    private final String EXIT_MINE_MENU = "\n- Ви обрали вихід в головне меню програми. -\n";
    private final String EXIT_SELECT = "\n- Ви обрали вихід з програми. Допобачення! -";
    private final String OFFER_OF_CHOICE = """
            = Оберіть метод розшифрування.
            Введіть відповідну цифру і натисніть Enter =
            """;
    private final String MENU_ITEMS = """
            1 - Метод з вибором ключа.
            2 - Метод Brute Force.
            3 - Вихід в головне меню.
            4 - Вихід з програми.
            """;
    private final String KEY_NOT_FOUND = "- Відповідного ключа не знайдено. -";
    ArrayList<Character> decryptionFile;

    @Override
    public String getMenuItems() {
        return MENU_ITEMS;
    }

    @Override
    public String getOfferOfChoice() {
        return OFFER_OF_CHOICE;
    }

    @Override
    public void getSelectionPosition1() {
        System.out.println(METHOD_WITH_KEY);
        KeySelectionDecryption keySelectionDecryption = new KeySelectionDecryption();
        keySelectionDecryption.operationSelection();
    }

    @Override
    public void getSelectionPosition2() {
        System.out.println(METHOD_BRUTEFORCE);
        bruteKey1();
        bruteKey2();
        bruteKey3();
        System.out.println(KEY_NOT_FOUND);
        new EndMenu().operationSelection();
    }

    @Override
    public void getSelectionPosition3() {
        new Menu().starting();
    }

    @Override
    public void getSelectionPosition4() {
        System.exit(0);
    }

    public void bruteKey1(){
        Key1 key1 = new Key1();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key1.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }
    public  void bruteKey2(){
        Key2 key2 = new Key2();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key2.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }

    public void bruteKey3(){
        Key3 key3 = new Key3();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        decryptionFile = decryptProcess.decryptionRun(key3.getINT_KEY());

        BruteForceKeyDetermination bruteForceKeyDetermination = new BruteForceKeyDetermination(decryptionFile);
        bruteForceKeyDetermination.determinationKey();
    }
}