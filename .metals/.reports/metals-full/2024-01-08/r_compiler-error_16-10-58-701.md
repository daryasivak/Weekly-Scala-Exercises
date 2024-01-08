file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

action parameters:
offset: 2357
uri: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
text:
```scala
// Aufgabe 1a

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
// Ergebnis: Der Boolesche Wert ist geliefert. Wenn alle Elemente das Prädikat erfüllen, dann ist true. Ansonsten false.
def isSorted[A](comp : (A, A) => Boolean, list : List[A]) : Boolean =
    list match
        case Nil => true
        case x :: Nil => true
        case x :: y :: xs => comp(x, y) && isSorted(comp, y :: xs)


// Aufgabe 1c

// Voraussetzung: Keine
// Ergebnis: Die Quersumme der Zahl ist geliefert.
def quersumme(zahl : Int) : Int =
    zahl match
        case 0 => 0
        case x if x < 0 => quersumme(x.abs)
        case _ => zahl % 10 + quersumme(zahl / 10)

// Voraussetzung: Keine
// Ergebnis: Die Liste ist geliefert, in der nur die Elemente enthalten sind, deren Quersumme größer ist, als value.
def takeNumbers(f: Int => Int, value: Int, liste: List[Int]): List[Int] =
  liste match
    case Nil                     => Nil
    case x :: xs if f(x) > value => x :: takeNumbers(f, value, xs)
    case x :: xs                 => takeNumbers(f, value, xs)
    
    
// Aufgabe 1d
// Voraussetzung: Keine.
// Ergebnis: Die Liste ist in der umgekehrten Reihenfolge geliefert.

def reverse_fold[A](input: List[A]): List[A] =
  input.foldLeft(List[A]())((acc, item) => item :: acc)


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

def lconcat[A](lists : List[A]*) : List[A] =
    lists.toList match
        case Nil => Nil 
        case x(@@)
    
// Aufgabe 2c

// Aufgabe 2d
    
    
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

  println(takeNumbers(quersumme, 4, List(1, 5, -24, 20, -5)))

  println(reverse_fold(List("me", "reverse", "please")))

  val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val predicate: Int => Boolean = (x: Int) => x % 2 == 0

  val (evenNumbers, oddNumbers) = partition(predicate, inputList)

  val expectedEven = List(2, 4, 6, 8, 10)
  val expectedOdd = List(1, 3, 5, 7, 9)

  if (evenNumbers == expectedEven) println("Test 6 passed!")
  else println(s"Test 6 failed! Expected: $expectedEven, got: $evenNumbers")
  if (oddNumbers == expectedOdd) println("Test 6 passed!")
  else println(s"Test 6 failed! Expected: $expectedOdd, got: $oddNumbers")
```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2582)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:92)
	scala.meta.internal.pc.SignatureHelpProvider$.$anonfun$1(SignatureHelpProvider.scala:48)
	scala.collection.StrictOptimizedLinearSeqOps.loop$3(LinearSeq.scala:280)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile(LinearSeq.scala:282)
	scala.collection.StrictOptimizedLinearSeqOps.dropWhile$(LinearSeq.scala:278)
	scala.collection.immutable.List.dropWhile(List.scala:79)
	scala.meta.internal.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:48)
	scala.meta.internal.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:388)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner