error id: file://<WORKSPACE>/src/main/scala/example/Tutorium.scala:[1305..1305) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Tutorium.scala", "// Aufgabe 1

/*
def everySecond(list : List[Int]) : List[Int] =
	def help(acc : List[Int], list : List[Int]) : List[Int] =
		list match
			case Nil => acc
			case x::Nil => acc:::List(x)
			case x::y::xs => help(acc:::List(x),xs)
	help(Nil,list)
*/

def biggest(list : List[Int]) : Int =

    def step(acc : List[Int], list : List[Int]) : List[Int] =
        list match
            case Nil => Nil
            case x :: xs => acc ::: List(x)
            case x :: y :: xs =>
                if x > y then step(acc ::: List(y), x :: xs)
                else step(acc ::: List(x), y :: xs)

    step(Nil, list) 

// Aufgabe 2
        
def fak(n : Int) : Int =
    if (n <= 0) then 1
    else Range(1, n + 1).toList.fold(1)(_*_)

def true_oder_false(p : Int => Boolean, list : List[Int]) : List[Boolean] =
    list match
        case Nil => Nil
        case x :: Nil => List(p(x)) 
        case x :: xs => p(x) :: true_oder_false(p, xs)

def true_oder_false_map(p : Int => Boolean, list : List[Int]) : List[Boolean] =
    list.map(p)

// Aufgabe 3

def isEmpty[A](list : List[A]) : Boolean =
    list match
        case _ :: xs => false
        case Nil => true

def peek[A](list : List[A]) : A =
    list match
        case Nil => Nil
        case x :: Nil => x
        case x :: xs => peek(xs)

@main def ")
file://<WORKSPACE>/src/main/scala/example/Tutorium.scala
file://<WORKSPACE>/src/main/scala/example/Tutorium.scala:53: error: expected identifier; obtained eof
@main def 
          ^
#### Short summary: 

expected identifier; obtained eof