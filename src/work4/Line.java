package work4;
/**
 * A Class that implements the {@link LineInt} interface and represents a line that can change opacity using the {@link #setOpacity} method
 * @author Bykovets Sergey
 */
public class Line implements LineInt {
    /**
     * Value for line opacity
     */
    private double op;
    /**
     * The method that creates the lines, sets the opacity value and displays information about it
     * @param op opacity of lines (0-1)
     */
    @Override
    public void setOpacity(double op) {
        this.op = op;
        System.out.println("Створено лінії для рамки з непрозорістю " + op);
    }
}
