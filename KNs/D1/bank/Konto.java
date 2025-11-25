package bank;

public class Konto {
    private String inhaber;
    private double guthaben;

    public Konto(String inhaber, double startGuthaben) {
        this.inhaber = inhaber;
        this.guthaben = startGuthaben;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getGuthaben() {
        return guthaben;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            guthaben += betrag;
            System.out.println(inhaber + " hat " + betrag + " CHF eingezahlt.");
        } else {
            System.out.println("Ungültiger Betrag!");
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= guthaben) {
            guthaben -= betrag;
            System.out.println(inhaber + " hat " + betrag + " CHF abgehoben.");
        } else {
            System.out.println("Abhebung nicht möglich!");
        }
    }

    public void ueberweisen(Konto ziel, double betrag) {
        if (betrag > 0 && betrag <= guthaben) {
            guthaben -= betrag;
            ziel.guthaben += betrag;
            System.out.println(inhaber + " hat " + betrag + " CHF an " + ziel.getInhaber() + " überwiesen.");
        } else {
            System.out.println("Überweisung fehlgeschlagen!");
        }
    }
}
