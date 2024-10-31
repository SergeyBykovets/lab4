package work4;
/**
 * A class that acts as a client, that is, sets the transparency of the image, the opacity of the lines, the type of frame and the visibility of the subsystem using methods from the class {@link Facade}
 * @author Bykovets Sergey
 */
public class Client{
    /**
     * Field of type {@link Facade}
     */
    private Facade facade;
    /**
     * Constructor for the class {@code Client}, it initializes a new {@link Line} and {@link Image},
     * and passes them to the {@link Facade}
     */
    public Client() {
        Line line = new Line();
        Image image = new Image();
        facade = new Facade(line, image);
    }
    /**
     * The method that sets the transparency of the image, the opacity of the lines, the type of frame and the visibility of the subsystem using methods from the class {@link Facade}
     */
    public void run() {
        facade.show(true);
        facade.setLineOpacity(0.5);
        facade.setImageTransparency(0.5);
        facade.changeBorder(new HorBorder());
    }
}
