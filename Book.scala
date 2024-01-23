class Book(private val id_ : Int, private val title_ : String,private val author_ : String){
    def this(title: String, author: String) = this(Var.acc,title,author)
    def id = this.id_
    def title = this.title_
    def author = this.author_
    def describe : Unit = println(s"${this.id};${this.title};${this.author}")
    def sameAuthor(aBook : Book) = this.author == aBook.author
    def ==(aBook : Book) = (this.id==aBook.id)&& (this.title==aBook.title) && (this.sameAuthor(aBook))
    override def toString : String = s"The id is ${this.id}\nThe title is ${this.title}\nThe author is ${this.author}"
}

object Var{
    private var ID : Int = 0
    def acc = {ID+=1;ID}    
}

class Biopic(private val famous_ : String, private val title_ : String, private val author_ : String) extends  
Book(title_,author_){
    def famous= this.famous_
    def ==(aBiopic : Biopic) = (super.title == (aBiopic.title)) && (super.author== (aBiopic.author)) && (this.famous    
== aBiopic.famous)
}

object Test extends App {
    val aBook = new Book("Les Misérables","Victor Hugo")
    val bBook = new Book("L'Assommoir","Emile Zola")
    val aBiopic = new Biopic("Romain Gary ","La Promesse de l'Aube","Romain Gary")    
    val bBiopic = new Biopic("John Nash","A beautiful Mind","Sylvia Nasar")
    val cBiopic = new Biopic("John Nash","A beautiful Mind","Sylvia Nasar")    
    aBook.describe 
    bBook.describe
    aBiopic.describe
   print(aBook)
    if (aBiopic sameAuthor aBook ) println("This is the same author ! ") else println("This is not the same author")
    if (bBiopic == cBiopic) println("This is the same book") else println("This is not the same book")    
}
def sameAuthor(author : String) = this.author == author
