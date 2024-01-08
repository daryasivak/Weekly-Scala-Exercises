// Aufgabe 1

/*
def everySecond(list : List[Int]) : List[Int] =
	def help(acc : List[Int], list : List[Int]) : List[Int] =
		list match
			case Nil => acc
			case x::Nil => acc:::List(x)
			case x::y::xs => help(acc:::List(x),xs)
	help(Nil,list)
*/

def biggest(list : List[Int]) : List[Int] =

    def step(acc : List[Int], list : List[Int]) : List[Int] =
        list match
            case Nil => acc
            case x :: Nil => acc ::: List(x)
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
        case Nil => throw new RuntimeException("List is empty")
        case x :: Nil => x
        case x :: xs => peek(xs)

def pop[A](list : List[A]) : List[A] =

    def step(acc : List[A], list : List[A]) : List[A] =
        list match
            case Nil => Nil
            case x :: Nil => acc
            case x :: xs => step(acc ::: List(x), xs)

    step(Nil, list)

def apply[A, B](p : A => B, list : List[A]) : List[B] =
    list match
        case Nil => Nil
        case x :: xs => p(x) :: apply(p, xs)
    
@main def test() : Unit =

    val list = List()
    println(pop(list))
    println(peek(list))
    val result = apply((x: Int) => x * 2, list)
    println(result)