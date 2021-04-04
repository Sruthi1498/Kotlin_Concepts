class OutKeyword <out T>(val value: T) {
    fun get(): T {
        return value
    }
}
fun main()
{
    val out = OutKeyword("string")
    val ref: OutKeyword<Any> = out

    val o : InKeyword<Number> = InKeyword()
    val ref1 = o
}

class InKeyword<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}