package work4;
/**
 * An interface for image that has a {@link #setTransparency} method to set the transparency of lines from 0 to 1
 * @author Bykovets Sergey
 */
public interface ImageInt {
    /**
     * The method that sets the transparency of lines
     * @param tr transparency of lines (0-1)
     */
    void setTransparency(double tr);
}
