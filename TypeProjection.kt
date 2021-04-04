fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)

    for (i in from.indices)
        to[i] = from[i]

    for (i in to.indices) {
        println(to[i])
    }
}
fun main() {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any :Array<Any> = Array(3) { "" }
    copy(ints, any)

}
