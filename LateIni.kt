class LateIni{
    lateinit var a :String

    fun set(a:String)
    {
        this.a = a
    }
    fun get(): String
    {
        if(::a.isInitialized) return a else return "not initialized"
    }

}
fun main()
{
    val o = LateIni()
    o.set("alice")
    println(o.get())
}