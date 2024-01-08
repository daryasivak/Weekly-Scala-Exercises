@main def test() : Unit =
    println(windchill_temperatur(-1, -6.9))
    println(umgekehrte_dezimal_darstellung(0))
    println(isLeapYear(1989))
    println(quersumme_der_dezimal_darstellung(0))
    println(istUhrzeit(4, 56, 78))
    println(countAsTroll(20))
    println(tick(23, -48, 57))
    println(kcit(22, 34, 9))
    println(addSekunden((23, 45, 56), 77))
    println(addMinuten((23, 45, 6), 180))
    println(addStunden((23, 0, 0), 5))

// Aufgabe 1a

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Die nach der bestimmten Formel berechnete Chilltemperatur ist geliefert.

// Tests: 
// windchill_temperatur(13, 6.9)
// windchill_temperatur(-13, 6.9)
// windchill_temperatur(13, -6.9)
// windchill_temperatur(-13, -6.9)
// windchill_temperatur(1, 1)
def windchill_temperatur(t : Double, v : Double) : Double =
    if (v < 0) then -1 
    else
        val t_chill : Double = 3.12 + 0.6215 * t + (0.3965 * t - 11.37) * Math.pow(v, 0.16)
        t_chill

// Aufgabe 1b

// Die Zahl 47142 ist eigegeben. Solange eingabe nichr 0 ist, wird case _ ausgeführt.
// val rest : Int = 2
// step(47142 / 10, "" + 2)
// val rest : Int = 4
// step(4714 / 10, "2" + 4)
// val rest : Int = 1
// step(471 / 10, "24" + 1)
// val rest : Int = 7
// step(47 / 10, "241" + 7)
// val rest : Int = 4
// step(4 / 10, "2417" + 4)
// Jetzt ist eingabe 0, daher ist die Kette geliefert. => "24174"

// 5 Schritte
// Voraussetzung: eingabe > 0
// Ergebnis: Die umgekehrte Dezimaldarstellung von eingabe ist als Zeichenkette geliefert.

// Tests:
// umgekehrte_dezimal_darstellung(76)
// umgekehrte_dezimal_darstellung(47142)
// umgekehrte_dezimal_darstellung(98)
def umgekehrte_dezimal_darstellung(eingabe : Int) : String =

    // 5 Schritte
    // Voraussetzung: eingabe > 0
    // Ergebnis: acc + "Der Rest vom Teilen durch 10" ist geliefert.
    def step(eingabe : Int, acc : String) : String =
        eingabe match 
            case 0 => acc
            case _ => 
                val rest : Int = eingabe % 10
                step(eingabe / 10, acc + rest)

    step(eingabe, "")


// Aufgabe 1c

// 5 Schritte
// Voraussetzung: eingabe > 0
// Ergenis: Jeder Schritt wird eingabe um 3 verringert und mit "Many" concateniert wird. Dadurch ist die Darstellung
// von Trolls geliefert
// Tests:
// countAsTrolls(234)
// countAsTrolls(16)
// countAsTrolls(20)
def countAsTroll(eingabe : Int) : String =
    eingabe match 
        case 0 => ""
        case 1 => "One"
        case 2 => "Two"
        case 3 => "Three"
        case x if x >= 4 && x < 16 => "Many-" + countAsTroll(eingabe - 4)
        case x if x >= 16 => "LOTS-" + countAsTroll(eingabe - 16)
                

// Aufgabe 1d

// Schleifen sind einfacher für Anfänger zu verstehen. Auch sind die Schleifen ganz gut für Listen von Elementen.
// Es kann zu Fehlern kommen, weil z.B. endlose Schleifen auftauche können. Es gibt keine Schleifen in Scala.
// Beispiel 1: 
    // for i in range(3):
        //print(i)

// Beispiel 2:
    // i = 0
    // while (i <= 3):
        // print(i)
        // i += 1

// Rekursionen sind nicht sehr effizient (O(log(n))) und brauchen viel Speicherplatz. 

// Beispiel 1 aus Python:
    // def fac(n):
        // if n == 0:
            // return 1
        // else
            // return n * fac(n-1)

// Beispiel 2 aus Scala:
    // def fac(n : Int) : Int =
        // n match
            // case 0 => 1
            // case _ => n * fac(n - 1)

// Endrekursionen sind effezienter als Rekursionen, da acc in Endrekursionen verwendet wird und
// dadurch wird der Stackerbrauch reduziert. In Python gibt es keine Endrekursionen.
// Beispiel:
    // def fac(n : Int) : Int =
        // def step(acc : Int, n : Int) : Int =
            // n match
                // case 0 => acc
                // case _ => step(n * acc, n - 1)
        // step(1, n)

        
// Aufagabe 2a

// 5 Schritte
// Voraussetzung: eingabe > 0
// Ergebnis: Es wird überprüft, ob das Jahr Schaltjahr ist. Wenn es schalt ist, ist true gelifert. Sonst ist falsch geliefert.
// Tests:
// isLeapYear(2000)
// isLeapYear(2100)
// isLeapYear(1989)
// isLeapYear(1)
def isLeapYear(eingabe : Int) : Boolean =
    if (eingabe % 400 == 0) then true 
    else if (eingabe % 4 == 0  && eingabe % 100 != 0) then true
    else false

// Aufagabe 2b

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Die Summe aller Ziffern der eingabe ist geliefert.
// Tests: 
// quersumme_der_dezimal_darstellung(0)
// quersumme_der_dezimal_darstellung(876)
// quersumme_der_dezimal_darstellung(07)

// Die Zahl 4742 wird eingegeben. Solange eingabe nicht 0 ist, wird der zweite case ausgeführt.
// step(0 + 2, 4714)
// step(2 + 4, 471)
// step(6 + 1, 47)
// step(7 + 7, 4)
// step(14 + 4, 0)
// eingabe = 0 => acc = 18 ist geliefert.

def quersumme_der_dezimal_darstellung(eingabe : Int) : Int =

    // 5 Schritte
    // Voraussetzung: Keine
    // Ergebnis: acc + "Rest vom Teilen der eingabe durch 10" ist geliefert.
    def step(acc : Int, eingabe : Int) : Int=
        eingabe match 
            case 0 => acc
            case _ =>
                val rest : Int = eingabe % 10
                step(acc + rest, eingabe / 10) 

    step(0, eingabe)

// Aufagabe 2c
type Uhrzeit = (Int, Int, Int)

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Es wird überprüft, ob die eingegebenen Werte der Zeit korrekt sind. Wenn alle korrekt sind, ist true geliefert.
// Ansonsten falsch.
// Tests:
// istUhrZeit(25, 56, 8)
// istUhrZeit(12, 78, 9)
// istUhrZeit(12, 44, 90)
// istUhrZeit(12, 78, 9)
// istUhrZeit(12, 56, 9)
def istUhrzeit(uhrzeit : (Int, Int, Int)) : Boolean =
    val (stunden, minuten, sekunden) = uhrzeit

    val istStunden : Boolean = if (stunden >= 0 && stunden <= 23) then true else false
    val istMinuten : Boolean = if (minuten >= 0 && minuten <= 59) then true else false
    val istSekunden : Boolean = if (sekunden >=0 && sekunden <= 59) then true else false

    if (istSekunden == true && istMinuten == true && istStunden == true) then true else false

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Es wird überprüft, ob die Zeit valid ist. Wenn ja, dann werden verschiedene cases betrachtet. 
// Wenn die passenden Fälle betrachtet wurden, ist der Type Uhrzeit mit den neuen Werten geliefrt. 
def tick(uhrzeit : (Int, Int, Int)) : Uhrzeit =
    val(stunden, minuten, sekunden) = uhrzeit

    if (istUhrzeit(uhrzeit)) then 

        sekunden match
            case 59 =>
                val sekunden_neu : Int = 0

                minuten match
                    case 59 =>
                        val minuten_neu : Int = 0

                        stunden match 
                            case 23 =>
                                val stunden_neu : Int = 0
                                (stunden_neu, minuten_neu, stunden_neu)
                            case _ => 
                                val stunden_neu : Int = stunden + 1
                                (stunden_neu, minuten_neu, sekunden_neu) 

                    case _ => 
                        val minuten_neu : Int = minuten + 1
                        (stunden, minuten_neu, sekunden_neu)

            case _ => 
                val sekunden_neu : Int = sekunden + 1
                (stunden, minuten, sekunden_neu)

    else (-1, -1, -1)

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Es wird überprüft, ob die Zeit valid ist. Wenn ja, dann werden verschiedene cases betrachtet. 
// Wenn die passenden Fälle betrachtet wurden, ist der Type Uhrzeit mit den neuen Werten geliefrt.
def kcit(uhrzeit : (Int, Int, Int)) : Uhrzeit =
    val(stunden, minuten, sekunden) = uhrzeit

    if(istUhrzeit(uhrzeit)) then 

        sekunden match
            case 0 =>
                val sekunden_neu : Int = 59

                minuten match
                    case 0 =>
                        val minuten_neu : Int = 59

                        stunden match 
                            case 0 =>
                                val stunden_neu : Int = 23
                                (stunden_neu, minuten_neu, sekunden_neu)
                            case _ => 
                                val stunden_neu : Int = stunden - 1
                                (stunden_neu, minuten_neu, sekunden_neu) 

                    case _ => 
                        val minuten_neu : Int = minuten - 1
                        (stunden, minuten_neu, sekunden_neu)

            case _ => 
                val sekunden_neu : Int = sekunden - 1
                (stunden, minuten, sekunden_neu)

    else (-1, -1, -1)

type Tag = (Int, Int, Int, Int)
// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Die veränderten Werte der uhrzeit wegen Sekunden sind als Type Tag geliefert. Wenn die neuen Werte größer sind, als ein Tag, 
// dann gibt es noch einen Tag
// addSekunden((23, 45, 6), 688)
// addSekunden((25, 45, 6), 688)
// addSekunden((23, 87, 6), 688)
// addSekunden((23, 45, 90), 688)
// addSekunden((23, 45, 6), 0)
def addSekunden(uhrzeit : (Int, Int, Int), zahl : Int) : Tag =
    val (stunden, minuten, sekunden) = uhrzeit

    if (istUhrzeit(uhrzeit) && zahl >= 0) then
        val summe_sekunden : Int = stunden * 3600 + minuten * 60 + sekunden
        val summe_sekunden_neu : Int = summe_sekunden + zahl

        val tag_neu : Int = summe_sekunden_neu / 86400
        val tag_neu_rest : Int = summe_sekunden_neu % 86400

        val stunden_neu : Int = tag_neu_rest / 3600 
        val stunden_neu_rest : Int = tag_neu_rest % 3600

        val minuten_neu : Int = stunden_neu_rest / 60

        val sekunden_neu : Int = stunden_neu_rest % 60

        (tag_neu, stunden_neu, minuten_neu, sekunden_neu)

    else (-1, -1, -1, -1)


// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Die veränderten Werte der uhrzeit wegen Minuten sind als Type Tag geliefert. Wenn die neuen Werte größer sind, als ein Tag, 
// dann gibt es noch einen Tag.
// Tests:
// addMinuten((23, 45, 7), 76)
// addMinuten((23, 45, 90), 76
// addMinuten((23, 78, 7), 76)
// addMinuten((27, 45, 7), 76)
// addMinuten((12, 5, 43), 8)
def addMinuten(uhrzeit : (Int, Int, Int), zahl : Int) : Tag =
    val (stunden, minuten, sekunden) = uhrzeit

    if (istUhrzeit(uhrzeit) && zahl >= 0) then
        val summe_minuten : Int = stunden * 60 + minuten
        val summe_minuten_neu : Int = summe_minuten + zahl

        val tag_neu : Int = summe_minuten_neu / 1440
        val tag_neu_rest : Int = summe_minuten_neu % 1440

        val stunden_neu : Int = tag_neu_rest / 60 
        val minuten_neu : Int = tag_neu_rest % 60

        (tag_neu, stunden_neu, minuten_neu, sekunden)

    else (-1, -1, -1, -1)

// 5 Schritte
// Voraussetzung: Keine
// Ergebnis: Die veränderten Werte der uhrzeit wegen Stunden sind als Type Tag geliefert. Wenn die neuen Werte größer sind, als ein Tag, 
// dann gibt es noch einen Tag.
// Tests:
// addStunden((23, 45, 7), 2)
// addStunden((23, 45, 90), 1)
// addStunden((23, 78, 7), 1)
// addStunden((27, 45, 7), 1)
// addStunden((12, 5, 43), 8)
def addStunden(uhrzeit : (Int, Int, Int), zahl : Int) : Tag =
    val (stunden, minuten, sekunden) = uhrzeit

    if (istUhrzeit(uhrzeit) && zahl >= 0) then
        val summe_stunden_neu : Int = stunden + zahl

        val tag_neu : Int = summe_stunden_neu / 24
        val stunden_neu : Int = summe_stunden_neu % 24

        (tag_neu, stunden_neu, minuten, sekunden)

    else (-1, -1, -1, -1)