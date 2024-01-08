error id: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:[1897..1898) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala", "// Aufgabe 1a

// Voraussetzung: Keine.
// Ergebnis: Die Liste mit den ersetzen Elementen ist geliefert.
def replace[A](p : A => A, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: replace(p, xs)

def replace_map[A](p : A => A, list : List[A]) : List[A] =
    list.map(p)

// Aufgabe 1b

// Voraussetzung: Keine.
// Der Boolesche Wert ist geliefert. Wenn alle Elemente das Prädikat erfüllen, dann ist true. Ansonsten false.
def isSorted[A](comp : (A, A) => Boolean, list : List[A]) : Boolean =
    list match
        case Nil => true
        case x :: Nil => true
        case x :: y :: xs => comp(x, y) && isSorted(comp, y :: xs)

// Aufgabe 1c

// Voraussetzung: Keine.
// Die Anzahl der Elemente deren Quersumme größer ist, als wert, ist geliefert. 
def take_Numbers(p: (Int, Int) => Int, list: List[Int], wert: Int): Int =

    def step(p: (Int, Int) => Int, list: List[Int], wert: Int, acc: Int): Int =
        list match 
            case Nil => acc
            case x :: xs =>
                if (wert >= 0) then step(p, xs, p(wert, x), acc + 1)
                else step(p, xs, wert, acc)

    step(p, list, wert, 0)
    
// Aufgabe 1d

// Aufgabe 2a

// Voraussetzung: Keine.
// Ergebnis: Zwei Listen sind geliefert.
def partition[A](p: A => Boolean, list: List[A]): (List[A], List[A]) =

  // Voraussetzung: Keine.
  // Ergebnis: Zwei Liste, die sortierte Elemente der Einagabeliste beinhalten, sind geliefert.
  def step(p: A => Boolean, list: List[A], list_erfüllt: List[A], list_erfüllt_nicht: List[A]): (List[A], List[A]) =
    list match
      case Nil => (list_erfüllt, list_erfüllt_nicht)
      case x :: xs =>
        if (p(x)) then step(p, xs, list_erfüllt ::: List(x), list_erfüllt_nicht)
        else step(p, xs, list_erfüllt, list_erfüllt_nicht ::: List(x))

  step(p, list, Nil, Nil)

// Aufgabe 2b

// Aufgabe 2c
def 
    
@main def test(): Unit =

  val result1 = replace((c: Char) => if (c == 'a') then 'b' else c, List('a', 'u', 'a', 'a', 'l', 'e', 's'))
  val expected1 = List('b', 'u', 'b', 'b', 'l', 'e', 's')
  if (result1 == expected1) then println("Test 1 passed!")
  else println(s"Test 1 failed! Expected: $expected1, got: $result1")

  val result2 = replace_map((x: Int) => x * 2, List(1, 2, 3, 4, 5))
  val expected2 = List(2, 4, 6, 8, 10)
  if (result2 == expected2) then println("Test 2 passed!")
  else println(s"Test 2 failed! Expected: $expected2, got: $result2")

  val result3 = isSorted((a: Int, b: Int) => a <= b, List(5, 4, 3, 2, 1))
  val expected3 = false
  if (result3 == expected3) println("Test 3 passed!")
  else println(s"Test 3 failed! Expected: $expected3, got: $result3")

  val result4 = take_Numbers((a: Int, b: Int) => a - b, List(12, 34, 56, 78), 13)
  val expected4 = 1
  if (result4 == expected4) println("Test 4 passed!")
  else println(s"Test 4 failed! Expected: $expected4, got: $result4")

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val predicate: Int => Boolean = (x: Int) => x % 2 == 0

  val (evenNumbers, oddNumbers) = partition(predicate, inputList)

  val expectedEven = List(2, 4, 6, 8, 10)
  val expectedOdd = List(1, 3, 5, 7, 9)

  if (evenNumbers == expectedEven) println("Test 6 passed!")
  else println(s"Test 6 failed! Expected: $expectedEven, got: $evenNumbers")
  if (oddNumbers == expectedOdd) println("Test 6 passed!")
  else println(s"Test 6 failed! Expected: $expectedOdd, got: $oddNumbers")")
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:62: error: expected identifier; obtained at
@main def test(): Unit =
^
#### Short summary: 

expected identifier; obtained at