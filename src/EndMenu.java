public final class EndMenu extends AbstractActionSelectionMenu {

    public final String MENU_ITEMS = """
            1 - Вихід в головне меню.
            2 - Вихід з програми.
            """;

    @Override
    public String getMenuItems() {
        return MENU_ITEMS;
    }

    @Override
    public void executingMenuItem1() {
        new Menu().starting();
    }

    @Override
    public void executingMenuItem2() {
        System.exit(0);
    }

    @Override
    public void executingMenuItem3() {
        System.out.println(super.ERROR_CHOICE);
        operationSelection();
    }

    @Override
    public void executingMenuItem4() {
        System.out.println(super.ERROR_CHOICE);
        operationSelection();
    }
}