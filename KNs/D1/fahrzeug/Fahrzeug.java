package fahrzeug;

public class Fahrzeug {
    private final String marke;
    private boolean repariert;
    private double reparaturKosten;

    public Fahrzeug(String marke) {
        this.marke = marke;
        this.repariert = false;
        this.reparaturKosten = 0;
    }

    public String getMarke() {
        return marke;
    }

    public boolean istRepariert() {
        return repariert;
    }

    public double getReparaturKosten() {
        return reparaturKosten;
    }

    public void reparieren(double kosten) {
        if (!repariert) {
            reparaturKosten = kosten;
            repariert = true;
            System.out.println(marke + " wurde repariert. Kosten: " + kosten + " CHF");
        } else {
            System.out.println(marke + " ist bereits repariert.");
        }
    }
}
