// Tutorium 12.12.2023

@main def test() : Unit =
    println(shopping("Apfel", 8))
    println(binary(87857))
    println(binary_endrekursiv(876876))
    println(collatz(3))

// 5 Schritte
// Voraussetzung: data(1) >= 0
// Ergebnis: Falls der Artikel existiert, wird der Gesamtpreis geliefert.
def shopping(bestellung : (String, Int)) : Double =
    bestellung match
        case ("Apfel", menge) => 7.5 * menge
        case ("Birne", menge) => 6 * menge
        case("Heidelbeeren", menge) => 5.4 * menge
        case("Kirsche", menge) => 4.7 * menge
        case _ => -1


// 5 Schritte (nicht endrekursiv)
// Voraussetzung: eingabe >= 0
// Ergebnis: Die Binärdarstellung vom eingabe ist als Zeichenkette geliefert.
def binary(eingabe : Int) : String =
    eingabe match 
        case 0 => "0"
        case 1 => "1"
        case _ => 
            binary(eingabe / 2) + (eingabe % 2).toString


// 5 Schritte
// Voraussetzung: eingabe >= 0
// Ergebnis: Die Binärdarstellung von eingabe ist als Zeichenkette gelliefert.
def binary_endrekursiv(eingabe : Int) : String =

    // 5 Schritte
    // Voraussetzung: Keine
    // Ergebnis: acc wird mit dem Rest von Teilen der eingabe durch 2 konkateniert und als Zeichenkette geliefert.
    def step(eingabe : Int, acc : String) : String =
        eingabe match 
            case 0 => acc
            case _ => 
                step(eingabe / 2, (eingabe % 2).toString + acc)
    
    step(eingabe, "")

def collatz(n : Int) : Int =

    def step(n : Int, acc : Int) : Int =
        print(s" -> ${n}")
        if n == 1 then 0
        else if (n % 2 == 0) then step(n / 2, acc + 1)
        else step(3 * n +  1, acc + 1)

    print("Start")
    val res : Int = step(n, 0)
    print("\n")
    res

def padovan_folge(n : Int) : Int =

    def step(acc1 : Int, acc2 : Int, acc3 : Int, n : Int) : Int =
        n match
            case n == 0 => acc2
            case _ => 
                step(acc2, acc3, acc1 + acc3, n - 1)

    step(1, 1, 1, n)        