fun main()
{
    val pair = Pair("ab",12)

    println(pair)
    println(pair.first)
    println(pair.second)

    val pair1 = Pair("alice","bob")

    println(pair1)
    val(firstname:String, lastname:String) = pair1

    println(firstname)
    println(lastname)
}