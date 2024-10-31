package work4;
/**
 * A Class that implements the {@link BorderInt} interface and creates a complete border using {@link #apply} method
 * @author Bykovets Sergey
 */
public class FullBorder implements BorderInt {
    /**
     * The method that creates a complete border and displays information about it
     */
    @Override
    public void apply() {
        System.out.println("Створено повне обрамлення");
    }
}
