/**
 * The Satellite class represents a satellite, which is a type of celestial body.
 * This class extends the Astre class and implements the Iorbitable interface.
 */
public class Satellite extends Astre implements Iorbitable {

    /**
     * Constructs a new Satellite with the specified name and mass.
     *
     * @param nom   the name of the satellite
     * @param masse the mass of the satellite
     */
    public Satellite(String nom, double masse) {
        super(nom, masse);
    }

    /**
     * Simulates the orbiting behavior of the satellite.
     * This method prints out a message indicating the satellite's name, its orbital behavior (around Earth), and its mass.
     */
    @Override
    public void orbiter() {
        System.out.println(nom + ", Orbite alentour de la Terre et pèse " + masse + " Tonnes.");
    }
}
