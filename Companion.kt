fun main()
{
    println(Companion.add(10,6))
    val o = Companion()
    println(o.sub(10,3))
}

class Companion()
{
    companion object{
        fun add(num1:Int, num2:Int) = num1.plus(num2)
    }

    fun sub(num1: Int,num2: Int) = num1.minus(num2)

}