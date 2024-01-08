error id: file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:[1951..1951) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala", "/*
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

def tail(list : List[Any]) : List[Any] =
    list match
        case Nil => throw Exception()
        case x :: xs => xs

def isEmpty(list : List[Any]) : Boolean =
    list match
        case Nil => true
        case _::xs => false

def length(list : List[Any]) : Int =
    list match
        case Nil => 0
        case _::xs => 1 + length(xs)

/* 
Concatenation of two lists:
List[1, 2, 3] ::: List[4, 5, 6]
 */

def concat(list1 : List[Any], list2 : List[Any]) : List[Any] =
    list1 match
        case Nil => list2
        case x::xs => x :: concat(xs, list2)

def take[A](n : Int, list : List[A]) : List[A] =
    (n, list) match
        case (0, _) => list
        case (n, Nil) => Nil
        case (n, x::xs) => x :: take(n - 1, xs)

def drop[A](n : Int, list : List[a]) : List[a] =
    (n, list) match
        case (0, _) => list
        case (n, Nil) => Nil
        case (n, x::xs) => drop(n - 1, xs)

def reverse[A](list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x::xs => reverse(xs) ::: List(x)

def reverse_endrekursiv[A](list : List[A]) : List[A] =
    def step(acc : List[A], list : List[A]) : List[A] =
        list match
            case Nil => Nil
            case x :: xs => step(x :: acc, xs)
    step(Nil, list)

def takeWhile(p : A => Boolean, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs if !p(x) => Nil
        case x :: xs => x :: takeWhile(p, xs) 

def dropWhile[A](p : A => Boolean, list : List[A]) : List[A]=
    list match
        case Nil => Nil
        case x :: xs if !p(x) => list
        case x :: xs => dropWhile(p, xs) 
    
def ")
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:77: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof