error id: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:[371..372) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala", "// Aufgabe 1a

// Voraussetzung: Alle Elemente sind vom Typ A.
// Ergebnis: Die Liste mit den ersetzen Elementen ist geliefert.
def replace[A](p : A => A, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: replace(p, xs)

def replace_map[A](p : A => A, list : List[A]) : List[A] =
    list.map(p)

// Aufgabe 1b

def
    

@main def test(): Unit =

  val result = replace((c: Char) => if (c == 'a') then 'b' else c, List('a', 'u', 'a', 'a', 'l', 'e', 's'))
  val expected = List('b', 'u', 'b', 'b', 'l', 'e', 's')
  if (result == expected) then println("Test passed!")
  else println(s"Test failed! Expected: $expected, got: $result")

  val result1 = replace_map((x: Int) => x * 2, List(1, 2, 3, 4, 5))
  val expected1 = List(2, 4, 6, 8, 10)
  if (result1 == expected1) then println("Test passed!")
  else println(s"Test failed! Expected: $expected1, got: $result1")
")
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala:18: error: expected identifier; obtained at
@main def test(): Unit =
^
#### Short summary: 

expected identifier; obtained at