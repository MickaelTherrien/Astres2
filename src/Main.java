/**
 * The Main class contains the main method to run the application.
 */
public class Main {

    /**
     * The main method to run the application.
     * It creates instances of celestial bodies and simulates their orbiting behavior.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Astre astre = new Astre("Astre", 55555);

        // Soleil soleil = new Soleil("Soleil", 4444);

        Planete planete = new Planete("Planete", 333);
        planete.orbiter();

        Planete terre = new Planete("Terre", 22);
        terre.orbiter();

        Planete mars = new Planete("Mars", 22);
        mars.orbiter();

        System.out.println("     ");
        System.out.println("     -----------------------------------------");
        System.out.println("     ");

        Satellite satellite = new Satellite("Sputnik 1", 1);
        satellite.orbiter();
    }
}
