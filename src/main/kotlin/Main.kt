fun main() {
    var name="capable"
    println("Capable"[0])
    println("Capable"[1])
    println("Capable"[2])
    println("Capable"[3])
    println("Capable"[4])
    println("Capable"[5])
    println("Capable"[6])
    name.length
    println(name.length)
    stmt("stmt2")
    val word="length"
    println("length")
    parameter(7)
    numbers()
    names("names")
    val human=Human("phelisia","female","black",5,57)
    human.rest()



}


//1.i)Create a string variable access the third character  then loop through it and print it in a vertical order.
// ii)get the length of the string
//iii) use an inbuilt function to the created string "its possible"
fun stmt(stmt:String){
    var stmt="I am capable of everything"
    var stmt2=stmt.plus(" " + "its possible")
    println(stmt2)

}
// 2 Create a string  that cannot be changed.
//3 Write a function that takes in a parameter,
// if seven it prints out neutral if not prints base otherwise acidic.
fun parameter(number:Int){
    if(number.equals(9)){
        println("nuetral")
    }else
        println("base otherwise acidic")
}
// 4 Create a function that takes in an a array and find the largest number.
fun numbers(){
    var num= arrayOf(5,90,70,76,54,39,20,57,158,)
    println(num.max())
    println(num.min())

}

// 5 Create a function that prints this in grammatical order
// var names= array of("anita"b," adalab", "hopperlab", "rwanda", "kenya", "tanzania"
fun names(names:String){
    var names= arrayOf("anita b","adalab", "hopperlab", "rwanda", "kenya", "tanzania")
    names.forEach { names -> println(names.capitalize()) }
    println(names)

}

// 6 create a class called Human with the properties name gender color height and weight.
// i) create two functions one called rest and the other one identitiy.
// function rest prints out "sleep eight hours and   am female and my name is Phelisia."
class Human(var name:String,var gender:String, var color:String, var height:Int, var weight:Int){
    fun rest(){
    var stmt="sleep eight hours and am $gender and my name is $name"
        println(stmt)
    }
    fun identity(){

    }


}


