package work4;
/**
 * A Class that implements the {@link BorderInt} interface and creates a vertical border using {@link #apply} method
 * @author Bykovets Sergey
 */
public class VerBorder implements BorderInt {
    /**
     * The method that creates a vertical border and displays information about it
     */
    @Override
    public void apply() {
        System.out.println("Створено вертикальне обрамлення");
    }
}
