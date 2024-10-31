package work4;
/**
 * A Class which is the facade, with which contains methods {@link #setImageTransparency}, {@link #setLineOpacity}, {@link #changeBorder}, {@link #show} with which you can set the transparency of the image, the opacity of the lines, the type of frame and the visibility of the subsystem
 * @author Bykovets Sergey
 */
public class Facade {
    /**
     * Fields of types {@link LineInt}, {@link ImageInt}, {@link BorderInt} and a boolean {@code visible} by which it is determined whether the subsystem will be visible
     */
    private LineInt line;
    private ImageInt image;
    private BorderInt bordertype;
    private boolean visible;
    /**
     * Constructor for the class {@code Facade}, initializes the facade with a specified {@link Line} and {@link Image}
     * @param line the line
     * @param image the image
     */
    public Facade(Line line, Image image){
        this.line = line;
        this.image = image;
        this.visible = false;
    }
    /**
     * The method that sets the visibility of the subsystem and displays information about it
     * @param vis true or false to show the subsystem
     */
    public void show(boolean vis){
        this.visible = vis;
        if (vis) {
            System.out.println("Відображення підсистеми увімк.");
        }
        else {
            System.out.println("Відображення підсистеми вимк.");
        }
    }
    /**
     * The method that changes the border type
     * @param newBordertype the new border type to be applied
     */
    public void changeBorder(BorderInt newBordertype) {
        this.bordertype = newBordertype;
        bordertype.apply();
    }
    /**
     * The method that sets the opacity of the line
     * @param op the opacity value to be set (0.0 to 1.0)
     */
    public void setLineOpacity(double op) {
        this.line.setOpacity(op);
    }
    /**
     * The method that sets the transparency of the image
     * @param tr the transparency value to be set (0.0 to 1.0)
     */
    public void setImageTransparency(double tr) {
        this.image.setTransparency(tr);
    }
}
