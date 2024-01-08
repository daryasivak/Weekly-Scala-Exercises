error id: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:[748..749) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala", "// Aufgabe 1a

// Voraussetzung: Alle Elemente sind vom Typ A.
// Ergebnis: Die Liste mit den ersetzen Elementen ist geliefert.
def replace[A](p : A => A, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: replace(p, xs)

def replace_map[A](p : A => A, list : List[A]) : List[A] =
    list.map(p)

// Aufgabe 1b

// Voraussetzung: Alle Elemente sind vom Typ A.
// Der Boolesche Wert ist geliefert. Wenn alle Elemente das Prädikat erfüllen, dann ist true. Ansonsten false.
def isSorted[A](comp : (A, A) => Boolean, list : List[A]) : Boolean =
    list match
        case Nil => true
        case x :: Nil => true
        case x :: y :: xs => comp(x, y) && isSorted(comp, y :: xs)

// Aufgabe 1c

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
")
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:26: error: expected identifier; obtained at
@main def test(): Unit =
^
#### Short summary: 

expected identifier; obtained at