public class Planete extends Astre implements Iorbitable {

    public Planete(String nom, double masse) {
        super(nom, masse);
    }

    @Override
    public void orbiter() {
        System.out.println(nom +", Orbite alentour du soleil et pese " + masse + " Tonnes.");
    }
}


//public Astre(String nom, double masse) {
//    this.nom = nom;
//    this.masse = masse;
//}
