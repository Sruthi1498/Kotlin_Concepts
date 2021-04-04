class Generics<T> (value: T)
{
    init {
        println(value.toString().length)
    }
}

fun main()
{
    Generics<String>("Alice")
    Generics(4566)
    Generics(true)
}