error id: file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:[317..317) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala", "/*
Cons-operator method:
val as : List[Nothing] = Nil
val bs : List[Int] = 12 :: 23 :: Nil
val cs : List[Char] = 'a' :: 'b' :: 'c' :: Nil

Constructor method:
val ds : List[Boolean] = List(true, false, true) 
*/


def head(list : List[Any]) : Any =
    list match
        case Nil => Nil
        case x::xs => x

def ")
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:17: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof