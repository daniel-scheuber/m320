package bank;

import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name des ersten Kontos: ");
        String name1 = sc.nextLine();
        bank.Konto konto1 = new bank.Konto(name1, 500);

        System.out.print("Name des zweiten Kontos: ");
        String name2 = sc.nextLine();
        bank.Konto konto2 = new bank.Konto(name2, 300);

        boolean aktiv = true;
        while (aktiv) {
            System.out.println("\n--- BANK MENÜ ---");
            System.out.println("1) Einzahlen");
            System.out.println("2) Abheben");
            System.out.println("3) Überweisen");
            System.out.println("4) Kontostand anzeigen");
            System.out.println("0) Beenden");
            System.out.print("Auswahl: ");
            int auswahl = sc.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Konto (" + konto1.getInhaber() + "(1)" + " oder " + konto2.getInhaber() + "(2)" + "): ");
                    int ktoE = sc.nextInt();
                    System.out.print("Betrag: ");
                    double betragE = sc.nextDouble();
                    if (ktoE == 1) konto1.einzahlen(betragE);
                    else konto2.einzahlen(betragE);
                    break;
                case 2:
                    System.out.print("Konto (" + konto1.getInhaber() + "(1)" + " oder " + konto2.getInhaber() + "(2)" + "): ");
                    int ktoA = sc.nextInt();
                    System.out.print("Betrag: ");
                    double betragA = sc.nextDouble();
                    if (ktoA == 1) konto1.abheben(betragA);
                    else konto2.abheben(betragA);
                    break;
                case 3:
                    System.out.print("Konto (" + konto1.getInhaber() + "(1)" + " oder " + konto2.getInhaber() + "(2)" + "): ");
                    int von = sc.nextInt();
                    System.out.print("Betrag: ");
                    double betragU = sc.nextDouble();
                    if (von == 1) konto1.ueberweisen(konto2, betragU);
                    else konto2.ueberweisen(konto1, betragU);
                    break;
                case 4:
                    System.out.println(konto1.getInhaber() + ": " + konto1.getGuthaben() + " CHF");
                    System.out.println(konto2.getInhaber() + ": " + konto2.getGuthaben() + " CHF");
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
