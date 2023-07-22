public final class EndMenu extends ChoiceOfAction{

    public final String MENU_ITEMS = """
            1 - Вихід в головне меню.
            2 - Вихід з програми.
            """;

    @Override
    public String getMenuItems(){
        return MENU_ITEMS;
    }

    @Override
    public void getSelectionPosition1(){
        new Menu().starting();
    }

    @Override
    public void getSelectionPosition2(){
        System.exit(0);
    }


    @Override
    public void getSelectionPosition3(){
        System.out.println(super.ERROR_CHOICE);
        operationSelection();
    }

    @Override
    public void getSelectionPosition4() {
        System.out.println(super.ERROR_CHOICE);
        operationSelection();
    }
}