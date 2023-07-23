public class ChoiceOfOperation extends ChoiceOfAction {
    public final String MENU_ITEMS = """
            1 - Шифрування.
            2 - Розшифровування.
            3 - Вихід в головне меню.
            4 - Вихід з програми.""";
    public final String SELECTION_POSITION_1 = "\n-Ви обрали операцію - Шифрування.-\n";
    public final String SELECTION_POSITION_2 = "\n-Ви обрали операцію - Розшифровування.-\n";
    public final String SELECTION_POSITION_3 = "\n-Ви обрали вихід в головне меню.-\n";
    public final String SELECTION_POSITION_4 = "\n-Ви обрали вихід з програми. Допобачення!-";
    Menu menu = new Menu();
    public String getMenuItems() {
        return MENU_ITEMS;

    }

    public void getSelectionPosition1() {
        System.out.println(SELECTION_POSITION_1);
        menu.encryptRun();
    }

    public void getSelectionPosition2() {
        System.out.println(SELECTION_POSITION_2);
        menu.decryptRun();
    }

    public void getSelectionPosition3() {
        System.out.println(SELECTION_POSITION_3);
        menu.starting();
    }

    public void getSelectionPosition4() {
        System.out.println(SELECTION_POSITION_4);
        System.exit(0);
    }
}