fun main()
{
    var name: String? = "Alcie"
    println(name?.length)

    name = null
    println(name?.length)

    val m : Int = name?.length?:0
    println(m)
}