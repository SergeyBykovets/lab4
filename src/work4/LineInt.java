package work4;
/**
 * An interface for lines that has a {@link #setOpacity} method to set the opacity of lines from 0 to 1
 * @author Bykovets Sergey
 */
public interface LineInt {
    /**
     * The method that sets the opacity of lines
     * @param op opacity of lines (0-1)
     */
    void setOpacity(double op);
}
