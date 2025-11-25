package fahrzeug;

import java.util.Scanner;

public class GaragenSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name der Garage: ");
        String garagenName = sc.nextLine();
        Garage garage = new Garage(garagenName);

        System.out.print("Marke des ersten Fahrzeugs: ");
        Fahrzeug auto1 = new Fahrzeug(sc.nextLine());

        System.out.print("Marke des zweiten Fahrzeugs: ");
        Fahrzeug auto2 = new Fahrzeug(sc.nextLine());

        boolean aktiv = true;
        while (aktiv) {
            System.out.println("\n--- GARAGEN MENÜ ---");
            System.out.println("1) Fahrzeug reparieren");
            System.out.println("2) Status anzeigen");
            System.out.println("0) Beenden");
            System.out.print("Auswahl: ");
            int auswahl = sc.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Welches Fahrzeug (" + auto1.getMarke() + "(1)" + " oder " + auto2.getMarke() + "(2)" + "): ");
                    int nr = sc.nextInt();
                    System.out.print("Reparaturkosten: ");
                    double kosten = sc.nextDouble();
                    if (nr == 1) garage.reparaturAnnehmen(auto1, kosten);
                    else garage.reparaturAnnehmen(auto2, kosten);
                    break;
                case 2:
                    System.out.println(auto1.getMarke() + " - Repariert: " + auto1.istRepariert() + ", Kosten: " + auto1.getReparaturKosten());
                    System.out.println(auto2.getMarke() + " - Repariert: " + auto2.istRepariert() + ", Kosten: " + auto2.getReparaturKosten());
                    break;
                case 0:
                    aktiv = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
            }
        }

        sc.close();
        System.out.println("Programm beendet.");
    }
}
