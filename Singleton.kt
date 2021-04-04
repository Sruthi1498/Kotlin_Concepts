object Singleton {
    fun add(num1:Int,num2:Int) = num1.plus(num2)
}

class Single
{
    fun add(num1:Int,num2:Int) = num1.plus(num2)
}
fun main()
{
    val o = Single()
    println(o.toString())
    val o1 = Single()
    println(o1.toString())

    println(Singleton.toString())
    println(Singleton.toString())

    println(Singleton.add(3,5))
}