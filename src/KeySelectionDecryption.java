public class KeySelectionDecryption extends ChoiceOfAction{
    private final String MENU_ITEMS = ("""
                Оберіть ключ:
                1 - Ключ №1.
                2 - Ключ №2.
                3 - Ключ №3.
                """);

    private final String YOUR_CHOICE1 = "- Ви обрали ключ №1 -";
    private final String YOUR_CHOICE2 = "- Ви обрали ключ №2 -";
    private final String YOUR_CHOICE3 = "- Ви обрали ключ №3 -";

    @Override
    public String getMenuItems() {
        return MENU_ITEMS;
    }

    @Override
    public void getSelectionPosition1() {
        System.out.println(YOUR_CHOICE1);
        Key1 key1 = new Key1();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key1.getINT_KEY());

    }

    @Override
    public void getSelectionPosition2() {
        System.out.println(YOUR_CHOICE2);
        Key2 key2 = new Key2();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key2.getINT_KEY());
    }

    @Override
    public void getSelectionPosition3() {
        System.out.println(YOUR_CHOICE3);
        Key3 key3 = new Key3();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key3.getINT_KEY());
    }

    @Override
    public void getSelectionPosition4() {
        System.out.println(ERROR_CHOICE);
        operationSelection();
    }
}