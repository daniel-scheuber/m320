@startuml

package bank {

    class Konto {
        - inhaber : String
        - guthaben : double

        + Konto(inhaber : String, startGuthaben : double)
        + getInhaber() : String
        + getGuthaben() : double
        + einzahlen(betrag : double) : void
        + abheben(betrag : double) : void
        + ueberweisen(ziel : Konto, betrag : double) : void
    }

    class Bank {
        - konten : List<Konto>

        + Bank()
        + addKonto(konto : Konto) : void
        + getKonten() : List<Konto>
    }

    class BankSimulation {
        + main(args : String[]) : void
    }

    ' Komposition: Bank besitzt beliebig viele Konten
    Bank "1" *-- "0..*" Konto : besitzt >

    ' BankSimulation nutzt Bank
    BankSimulation --> Bank : nutzt
}

@enduml
