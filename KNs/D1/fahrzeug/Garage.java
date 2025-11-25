package fahrzeug;

public class Garage {
    private final String name;

    public Garage(String name) {
        this.name = name;
    }

    public void reparaturAnnehmen(Fahrzeug f, double kosten) {
        System.out.println("Garage " + name + " nimmt das Fahrzeug " + f.getMarke() + " zur Reparatur an.");
        f.reparieren(kosten);
    }
}
