public class KeySelectionDecryption extends AbstractActionSelectionMenu {

    @Override
    public String getMenuItems() {
        return ("""
                Оберіть ключ:
                1 - Ключ №1.
                2 - Ключ №2.
                3 - Ключ №3.
                """);
    }

    @Override
    public void executingMenuItem1() {
        System.out.println("- Ви обрали ключ №1 -");
        Key1 key1 = new Key1();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key1.getINT_KEY());

    }

    @Override
    public void executingMenuItem2() {
        System.out.println("- Ви обрали ключ №2 -");
        Key2 key2 = new Key2();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key2.getINT_KEY());
    }

    @Override
    public void executingMenuItem3() {
        System.out.println("- Ви обрали ключ №3 -");
        Key3 key3 = new Key3();
        DecryptionProcess decryptProcess = new DecryptionProcess();
        Menu.decryptionFile = decryptProcess.decryptionRun(key3.getINT_KEY());
    }

    @Override
    public void executingMenuItem4() {
        System.out.println(ERROR_CHOICE);
        operationSelection();
    }
}