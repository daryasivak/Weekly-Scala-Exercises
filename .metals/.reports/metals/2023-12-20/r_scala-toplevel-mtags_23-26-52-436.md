error id: file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:[3270..3270) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala", "/*
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
    
def filter(p : A => Boolean, list : List[A]) : List[A] =
    list match
        case Nil => Nil
        case x :: xs if p(x) => x :: filter(p, xs)
        case x :: xs => filter(p, xs)
    
def map[A, B](f : A => B, list : List[A]) : List[B] =
    list match 
        case Nil => Nil
        case x :: xs => f(x) :: map(f, xs)

def sum(list : List[Int]) : Int =
    list match
        case Nil => 0
        case x :: xs => x + sum(xs)
    
def prod(list : List[Int]) : Int =
    list match
        case Nil => 1
        case x :: xs => x * prod(xs)

def foldr[A, B](f : (A, B) => B, e : B, list : List[A]) : B =
    list match
        case Nil => e
        case x :: xs => f(x, foldr(f, e, xs))
// def prod(list : List[Int]) = foldr((_:Int) * (_:Int), 1, list)
// def sum(list : List[Int]) = foldr((_:Int) + (_:Int), 0, xs)

def foldl[A, B](f : (A, B) => A, acc : A, list : List[B]) : A =
    list match
        case Nil => acc
        case x :: xs => foldl(f, f(e, xs), xs)
    
def forAll[A](p : A => Boolean, list : List[A]) : Boolean =
    list match
        case Nil => true
        case x :: xs => p(x) && forAll(p, xs)

def insert(y : Int, list : List[Int]) : List[Int] =
    list match
        case Nil => List(y)
        case x :: xs if y <= x => y :: x :: xs
        case x :: xs => x :: insert(y, xs) 

def 
    ")
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala
file://<WORKSPACE>/src/main/scala/example/Vorlesung.scala:122: error: expected identifier; obtained eof
    
    ^
#### Short summary: 

expected identifier; obtained eof