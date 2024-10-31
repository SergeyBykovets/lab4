package work4;
/**
 * Main class that contains a method that creates an instance of {@link Client} and runs its {@code run()} method
 * @author Bykovets Sergey
 */
public class Main {
    /**
     * The main method that creates an instance of {@link Client} and runs its {@code run()} method
     */
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}