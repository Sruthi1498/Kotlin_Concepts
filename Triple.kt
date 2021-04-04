fun main()
{
    val triple = Triple("ab",12,87)

    println(triple)
    println(triple.first)
    println(triple.second)
    println(triple.third)

    val triple1 = Triple("alice","bob","jack")

    println(triple1)
    val(firstname:String,middlename:kotlin.String, lastname:String) = triple1

    println(firstname)
    println(middlename)
    println(lastname)
}