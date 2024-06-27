/**
 * The Astre class represents a celestial body with a name and mass.
 */
public class Astre {

    /**
     * The mass of the celestial body.
     */
    protected double masse;

    /**
     * The name of the celestial body.
     */
    protected String nom;

    /**
     * Constructs a new Astre with the specified name and mass.
     *
     * @param nom   the name of the celestial body
     * @param masse the mass of the celestial body
     */
    public Astre(String nom, double masse) {
        this.nom = nom;
        this.masse = masse;
    }
}
