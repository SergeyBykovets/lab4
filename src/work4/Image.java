package work4;
/**
 * A Class that implements the {@link ImageInt} interface and represents image that can change transparency using the {@link #setTransparency} method
 * @author Bykovets Sergey
 */
public class Image implements ImageInt {
    /**
     * Value for image transparency
     */
    private double tr;
    /**
     * The method that creates the image, sets the transparency value and displays information about it
     * @param tr transparency of lines (0-1)
     */
    @Override
    public void setTransparency(double tr) {
        this.tr = tr;
        System.out.println("Створено зображення з прозорістю " + tr);
    }
}
