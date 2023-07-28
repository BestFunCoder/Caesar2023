import java.util.Scanner;

public abstract class AbstractActionSelectionMenu {
    public final int MENU_ITEM_POSITION_1 = 1;
    public final int MENU_ITEM_POSITION_2 = 2;
    public final int MENU_ITEM_POSITION_3 = 3;
    public final int MENU_ITEM_POSITION_4 = 4;
    public final String ERROR_CHOICE = "\n-Ви зробили помилковий вибір, спробуйте ще раз.-\n";
    int select;

    public abstract String getMenuItems();

    public String getOfferOfChoice() {
        return """
                = Виберіть необхідну дію.
                Введіть цифру та натисніть Enter: =""";
    }

    public abstract void executingMenuItem1();

    public abstract void executingMenuItem2();

    public abstract void executingMenuItem3();

    public abstract void executingMenuItem4();

    public void operationSelection() {
        System.out.println(getOfferOfChoice());
        System.out.println(getMenuItems());
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
            positionSelection();
        }
    }

    public void positionSelection() {
        switch (select) {
            case MENU_ITEM_POSITION_1 -> executingMenuItem1();
            case MENU_ITEM_POSITION_2 -> executingMenuItem2();
            case MENU_ITEM_POSITION_3 -> executingMenuItem3();
            case MENU_ITEM_POSITION_4 -> executingMenuItem4();
            default -> {
                System.out.println(ERROR_CHOICE);
                operationSelection();
            }
        }
    }
}