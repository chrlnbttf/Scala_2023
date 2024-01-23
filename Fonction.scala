def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
}

val l = List(1,2,3,4,5)
println(last(l))
