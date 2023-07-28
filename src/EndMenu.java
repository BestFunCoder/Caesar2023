public final class EndMenu extends AbstractActionSelectionMenu {

    @Override
    public String getMenuItems() {
        return """
                1 - Вихід в головне меню.
                2 - Вихід з програми.
                """;
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