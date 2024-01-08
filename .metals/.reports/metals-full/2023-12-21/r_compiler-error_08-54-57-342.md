file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

action parameters:
offset: 413
uri: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
text:
```scala
// Aufgabe 1a

// Voraussetzung: Alle Elemente sind vom Typ A.
// Ergebnis: Die Liste mit den ersetzen Elementen ist geliefert.
def replace[A](p : A => A, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: replace(p, xs)

def replace_map[A](p : A => A, list : List[A]) : List[A] =
    list.map(p)

// Aufgabe 1b

def isSorted(comp : (A, A) => Boolean, list : Liste[@@])
    

@main def test(): Unit =

  val result = replace((c: Char) => if (c == 'a') then 'b' else c, List('a', 'u', 'a', 'a', 'l', 'e', 's'))
  val expected = List('b', 'u', 'b', 'b', 'l', 'e', 's')
  if (result == expected) then println("Test passed!")
  else println(s"Test failed! Expected: $expected, got: $result")

  val result1 = replace_map((x: Int) => x * 2, List(1, 2, 3, 4, 5))
  val expected1 = List(2, 4, 6, 8, 10)
  if (result1 == expected1) then println("Test passed!")
  else println(s"Test failed! Expected: $expected1, got: $result1")

```



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2582)
	scala.meta.internal.pc.SignatureHelpProvider$.isValid(SignatureHelpProvider.scala:83)
	scala.meta.internal.pc.SignatureHelpProvider$.notCurrentApply(SignatureHelpProvider.scala:94)
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