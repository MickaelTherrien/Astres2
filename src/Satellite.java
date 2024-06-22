public class Satellite extends Astre implements Iorbitable{
    public Satellite(String nom, double masse) {
        super(nom, masse);
    }

    @Override
    public void orbiter() {
        System.out.println(nom +", Orbite alentour de la Terre et pese " + masse + " Tonnes.");
    }
}
