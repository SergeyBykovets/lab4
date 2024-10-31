package work4;
/**
 * A Class that implements the {@link BorderInt} interface and creates a horizontal border using {@link #apply} method
 * @author Bykovets Sergey
 */
public class HorBorder implements BorderInt {
    /**
     * The method that creates a horizontal border and displays information about it
     */
    @Override
    public void apply() {
        System.out.println("Створено горизонтальне обрамлення");
    }
}
