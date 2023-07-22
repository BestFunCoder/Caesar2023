import java.util.Scanner;

public abstract class ChoiceOfAction {
    public final int MENU_ITEM_POSITION_1 = 1;
    public final int MENU_ITEM_POSITION_2 = 2;
    public final int MENU_ITEM_POSITION_3 = 3;
    public final int MENU_ITEM_POSITION_4 = 4;
    private final String OFFER_OF_CHOICE = """
            = Виберіть необхідну дію.
            Введіть цифру та натисніть Enter: =""";
    public final String ERROR_CHOICE = "\n-Ви зробили помилковий вибір, спробуйте ще раз.-\n";
    int select;
    public abstract String getMenuItems();
    public String getOfferOfChoice(){
        return OFFER_OF_CHOICE;
    }
    public abstract void getSelectionPosition1();
    public abstract void getSelectionPosition2();
    public abstract void getSelectionPosition3();
    public abstract void getSelectionPosition4();

    public void operationSelection() {
        System.out.println(getOfferOfChoice());
        System.out.println(getMenuItems());
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
            positionSelection();
        }
    }

    public int operationSelectionReturnInt(){
        operationSelection();
        positionSelection();
        return select;
    }

    public void positionSelection(){
        switch (select) {
            case MENU_ITEM_POSITION_1 -> getSelectionPosition1();
            case MENU_ITEM_POSITION_2 -> getSelectionPosition2();
            case MENU_ITEM_POSITION_3 -> getSelectionPosition3();
            case MENU_ITEM_POSITION_4 -> getSelectionPosition4();
            default -> {
                System.out.println(ERROR_CHOICE);
                operationSelection();
            }
        }
    }
}