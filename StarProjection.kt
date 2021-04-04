
fun display(array: Array<*>) {
    array.forEach { print(it) }
}
fun main(args :Array<String>) {
    val name = arrayOf("alice","bob","jack")
    display(name)
}
