class Lazy(name:String, id:Int) {
    init {
        println("$name and $id")
    }
}

fun main()
{
    val u : Lazy by lazy { Lazy("alice",12) }
}