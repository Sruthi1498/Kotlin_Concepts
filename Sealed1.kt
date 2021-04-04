sealed class Employee

data class Engineer(val name:String,val i: Int, val age:Int): Employee()
class Manager(val name: String,val i: Int,val salary:Double): Employee()
object Intern: Employee()

fun main()
{
    val employee : Employee = Engineer("Alice",12,23)

    val msg : String = when(employee)
    {
        is Engineer -> {
            "${employee.name}, ${employee.i} ,  ${employee.age}"
        }
        Intern -> {
            "welcome intern"
        }
        is Manager -> {"${employee.name}, ${employee.i} ,  ${employee.salary}"}
        else -> {"not found"}
    }
    println(msg)
}