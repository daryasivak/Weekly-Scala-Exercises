error id: file://<WORKSPACE>/src/main/scala/example/Tutorium.scala:[899..899) in Input.VirtualFile("file://<WORKSPACE>/src/main/scala/example/Tutorium.scala", "// Aufgabe 1

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

def true_oder_false(p : Int => Boolean, list : List[Int]) : List[Int] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: true_oder_false(p, xs)

def ")
file://<WORKSPACE>/src/main/scala/example/Tutorium.scala
file://<WORKSPACE>/src/main/scala/example/Tutorium.scala:36: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof