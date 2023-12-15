// 13.12.2023

// Endrekursion:
// In jedem Funktionsaufruf ist der rekursive Aufruf der letzte Schritt.

// 5 Schritte
// Voraussezung: Keine
// Ergebnis: Die Anzahl der Großbuchstaben des Eingabestrings ist geliefert. 
// Effekt: Keiner

def countCapitals(s : String) : Int =

  // 5 Schritte
  // Voraussetzung: Keine
  // Effekt: Keiner
  // Ergebnis: acc + "Die Anzahl der Großbuchstaben im Bereich i...s.length-1" wird geliefert.
  def step(acc : Int, i : Int) : Int =
    if (s.length == i) then acc
    else {
      val isCapital : Int = if (s(i) >= 'A' && s(i) <= 'Z') then 1 else 0
      step(acc + isCapital, i + 1)
    }

  step(0, 0)

type Tabelle = (Int, Int)

// 5 Schritte
// Voraussetzung: Keine
// Effekt: Keiner
// Die Anzahl der Nullen und der Einsen der Binärdarstellung wird geliefert.

def histogramm(n : Int) : Tabelle =

  // 5 Schritte
  // Voraussetzung: n >= 0
  // Effekt: Keiner
  // Ergebnis: (Die Anzahl der Nullen + accN, die Anzahl der Einsen + accE) der Binärdarstellung wird geliefert.
  // Ist n = 0, wird (accN, accE) geliefert.
  def step(accN : Int, accE : Int, n : Int) : Tabelle =
    n match
      case 0 => (accN, accE)
      case _ =>
        val rest : Int = n % 2
        step(accN + (1 - rest), accE + rest, n/2) 

  step(0, 0, n)

@main def test() : Unit =
  println(countCapitals("UHuHugUGHuuugG"))
  println(histogramm(7856))
  println(countDigits(87457))
  println(countEvenOdd(879579745))

// 5 Schritte
// Voraussetzung: Keine
// Effekt: Keiner
// Ergebnis: Die Anzahl der Nullen und Einsen der Binärdarstellung ist geliefert.

def countDigits(n : Int) : Int =

  // 5 Schritte 
  // Voraussetzungen: Keine
  // Effekt: Keiner
  // Ergebnis: Die Anzahl der Binärziffern ist gelifert, da acc jede Runde um 1 hochgesetzt wird.
  def step(acc : Int, n : Int) : Int =
    n match
      case 0 => acc
      case _ =>
        step(acc + 1, n / 2)

  step(0, n)

def countEvenOdd(n : Int) : Tabelle =

  def step(accN : Int, accE : Int, n : Int) : Tabelle =
    n match
      case 0 => (accN, accE)
      case _ =>
        val rest : Int = n % 2
        step(accN + (1 - rest), accE + rest, n / 2)

  step(0, 0, n) 


// Quelltext aus den Videos

def fak(n : Int) : Int =
  n match
    case 0 => 1
    case _ => n * fak(n - 1)


def fak_endrekursiv(n : Int) : Int =

    def step(n : Int, acc : Int) : Int =
      n match 
        case 0 => acc
        case _ => step(acc * n, n - 1)

    step(1, n)


def fib_endrekursiv(n : Int) : Int =

  def step(acc1 : Int, acc2 : Int, n : Int) : Int =
    n match
      case 0 => acc2
      case _ => 
        step(acc1 + acc2, acc1, n - 1)


  step(1, 0, n)