public class ChoiceOperationEncryptOrDecrypt extends AbstractActionSelectionMenu {
    Menu menu = new Menu();

    public String getMenuItems() {
        return """
                1 - Шифрування.
                2 - Розшифровування.
                3 - Вихід в головне меню.
                4 - Вихід з програми.""";
    }

    public void executingMenuItem1() {
        System.out.println("\n-Ви обрали операцію - Шифрування.-\n");
        menu.encryptRun();
    }

    public void executingMenuItem2() {
        System.out.println("\n-Ви обрали операцію - Розшифровування.-\n");
        menu.decryptRun();
    }

    public void executingMenuItem3() {
        System.out.println("\n-Ви обрали вихід в головне меню.-\n");
        menu.starting();
    }

    public void executingMenuItem4() {
        System.out.println("\n-Ви обрали вихід з програми. Допобачення!-");
        System.exit(0);
    }
}