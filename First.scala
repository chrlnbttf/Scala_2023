# Utiliser des array pour mettre à jour des listes

object First extends App {
val anArray = Array("A","B","C")
println(anArray(0))
anArray.update(0,"1")
val arr = anArray.toList
println(arr)
}

