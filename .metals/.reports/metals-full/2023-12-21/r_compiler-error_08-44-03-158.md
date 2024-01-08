file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition isEmpty is defined in
  <WORKSPACE>/src/main/scala/example/Vorlesung.scala
and also in
  <WORKSPACE>/src/main/scala/example/Tutorium.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

action parameters:
offset: 177
uri: file://<WORKSPACE>/src/main/scala/example/Aufgaben.scala
text:
```scala
// Aufgabe 1a

def replace[A](p : A => A, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: replace(p, xs)

def replace_map[A](p@@)
    

@main def test(): Unit =
  val result = replace((c: Char) => if (c == 'a') then 'b' else c, List('a', 'u', 'a', 'a', 'l', 'e', 's'))
  val expected = List('b', 'u', 'b', 'b', 'l', 'e', 's')
  if (result == expected) then println("Test passed!")
  else println(s"Test failed! Expected: $expected, got: $result")
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition isEmpty is defined in
  <WORKSPACE>/src/main/scala/example/Vorlesung.scala
and also in
  <WORKSPACE>/src/main/scala/example/Tutorium.scala
One of these files should be removed from the classpath.