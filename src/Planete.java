/**
 * The Planete class represents a planet, which is a type of celestial body.
 * This class extends the Astre class and implements the Iorbitable interface.
 */
public class Planete extends Astre implements Iorbitable {

    /**
     * Constructs a new Planete with the specified name and mass.
     *
     * @param nom   the name of the planet
     * @param masse the mass of the planet
     */
    public Planete(String nom, double masse) {
        super(nom, masse);
    }

    /**
     * Simulates the orbiting behavior of the planet.
     * This method prints out a message indicating the planet's name, its orbital behavior, and its mass.
     */
    @Override
    public void orbiter() {
        System.out.println(nom + ", Orbite alentour du soleil et pese " + masse + " Tonnes.");
    }
}
