enum class Student(val type:String)
{
    MALE("male"),FEMALE("female")
}
class Stu(private val name: String, private val t: Student)
{
    init
    {
        println("$name is ${t.type}")
    }
}
fun main()
{
    Stu("alice" , Student.FEMALE)
    Stu("bob", Student.MALE)

    for (type in Student.values())
    {
        println("${type.name} ${type.ordinal}")
    }
}