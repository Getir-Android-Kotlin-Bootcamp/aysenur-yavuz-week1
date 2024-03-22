fun main() {
    
    //page 9 -Println
    println("Page 9:")
    println("Greetings everyone!")
    
    //page 10 -Functions
    println("Page 10:")
    calculateAverage(3f,6f)
    
    //page 11 -Variables
    println("Page 11:")
    val theValue1 =14
    println("my value is: $theValue1 and its unchangeable")
    
    var x = 0
    x-=5
    println("my value is: $x and its changeable")
    
    //page 12 -Classes and instances
    val game = Game("Fallout: New Vegas",2010)
    println("Page 12:")
    println(game.message)
    
    //page 13 -Classes and instances
    val lily = Lily("white")
    println("Page 13:")
    lily.color()
    
    //page 14 -Strings
    val str1 = "This bootcamp is great"
    val replacedStr = str1.replace("great", "awesome")
    println("Page 14:")
    println(replacedStr)
    
    //page 15 -If
    val currentTemp = -5.0
    println("Page 15:")
    checkTemperature(currentTemp)
    
    //page 16 -For
    
    val colors = arrayOf("Red", "Green", "Blue")
    println("Page 16:")
	for (index in colors.indices) {
    println("Index $index: ${colors[index]}")
}
    //page 17 -While
    
    var i = 1

    // numbers from 1 to 5
    println("Page 17:")
    while (i <= 5) {
        println(i)
        i++
    }
    
    //page 18 -When
    
     val number1 = 7

    val numberString = when {
        number1 % 2 == 0 -> "Even number"
        number1 % 3 == 0 -> "Divisible by three"
        number1 % 5 == 0 -> "Divisible by five"
        else -> "Other"
    }
	println("Page 18:")
    println("$number1, $numberString")
    
    //page 19 -Ranges
    
    val range = 1..100
	println("Page 19:")
    println("Numbers divisible by 3 and 5 in the range 1 to 100:")
    for (number2 in range) {
        if (number2 % 3 == 0 && number2 % 5 == 0) {
            println(number2)
        }
    }
    
    //page 20 -Collections
    
    println("Page 20:")
    val games = listOf("Fallout", "Mount & Blade", "Dishonored" , "Baldur's Gate")
    games.filter{it.startsWith("B")}
    			.map{ it.uppercase()}
                .sortedBy{it}
    			.forEach{println(it)}
                
    //page 21 -Null check
    val obj: String? = "Pillow"
    println("Page 21:")
    checkNull(obj)
    
    //page 22  -Type Checks
    val num = 558
    println("Page 22:")
    printObjectType(num)

    
    //page 37 -DTO
    println("page 37:")
   val studentDataFromDatabase = mapOf("id" to 1L, "name" to "John Doe", "grade" to 12)
    val studentDTO = StudentDTO(
        id = studentDataFromDatabase["id"] as Long,
        name = studentDataFromDatabase["name"] as String,
        grade = studentDataFromDatabase["grade"] as Int
    )
    println("Student ID: ${studentDTO.id}")
    println("Student Name: ${studentDTO.name}")
    println("Student Grade: ${studentDTO.grade}")
    
    //page 38 -Default Parameters
    
     println("Page 38:")
     print("with default parameters: ")
     welcome()
     print("with customized parameters: ")
     welcome("What's up", "Doc")
     
     //page 39 -List filter
     println("Page 39:")
     
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbers = numbers.filter { it % 2 != 0 }
    println("Odd numbers: $oddNumbers")
    
    //page 40 -Check collection
    println("Page 40:")
    val names = listOf("James", "Kirk", "Lars", "Robert")

    val searchName = "Kirk"

    if (searchName in names) {
        println("$searchName found in the list.")
    } else {
        println("$searchName not found in the list.")
    }
    
    //page 41 -Instance Checks
    println("Page 41")
    
     val obj1: Any = "Hello"
    val obj2: Any = 123
    val obj3: Any = listOf(1, 2, 3)

    printObjectType(obj1)
    printObjectType(obj2)
    printObjectType(obj3)
    
    //Page 44 -Traverse a map or list of pairs
    println("Page 44:")
    val listOfPairs = listOf(
        "apple" to 5,
        "banana" to 8,
        "orange" to 3
    )

    listOfPairs.forEachIndexed { index, pair ->
        val (fruit, quantity) = pair
        println("Item ${index + 1}: $fruit - Quantity: $quantity")
    }
    
    //Page 45 -Lazy Property
    println("Page 45:")
     val lazy = LazyProperty()
    
    
    println("Accessing lazy property:")
    println(lazy.lazyProperty) 
    println(lazy.lazyProperty) 
    
    //Page 46 -Extension Function
    
    println("Page 46:")
    val n1 = 10
	println(n1.isEven()) // true

	val n2 = 7
	println(n2.isEven()) //false
  
    
    //Page 47 -Singleton
    println("Page 47:")
    Singleton.doSomething()
    println()
    Singleton.doSomething()
    
    //Page 48 -Abstract Classes
    println("Page 48:")
    val car = Car("Toyota", "Red")
    val motorcycle = Motorcycle("Harley Davidson", "Black")
    
    car.start()
    motorcycle.start()
    
    //Page 49 -If-not-null shorthand
    println("Page 49")
    val nullableString: String? = "Hello"
	val length = nullableString?.length ?: -1
	println("Length of variable: $length")
    
    
    //Page 50 -If-not-null shorthand
    println("Page 50")
    val result = nullableString?.run { 
        "Length of variable: $length"
    } ?: "variable is null"
    
    println(result)
    
    //Page 51 -If-not-null shorthand
    println("Page 51")
   val values: Map<String, String?> = mapOf(
    "email" to "any email",
    "name" to "John",
    "age" to "30",
    "city" to "New York",
)
   
val email = values["email"]
    ?: throw IllegalStateException("Email is missing!")

	println("Email: $email")
    
     //Page 52-53
    println("Page 52&53")
    val spnNames = listOf("Dean", "Bob", "Charlie", "Cass")
	val startsWithB = spnNames.firstOrNull { it.startsWith("B") }

	println("First name starting with 'B': $startsWithB") 

    startsWithB?.let {
        println("First name starting with 'B': $it") 
    } ?: println("No names starting with 'B' found") 
    
     //Page 54
    println("Page 54")
    
    val name: String? = "Ayşenur"
    name?.let {
        println("Name is not null: $it")
    } ?: println("Name is null")
    
     //Page 55
    println("Page 55")
    val playerAction = "attack"

    val result2 = when (playerAction) {
        "attack" -> "Player attacks!"
        "defend" -> "Player defends!"
        "run" -> "Player runs away!"
        else -> "Unknown action!"
    }

    println(result2)
    
    //Page 56 -try catch
    println("Page 56")
     var playerHealth = 100

    println("Game started!")

    repeat(10) {
        playerHealth -= 20 // decrease health
        if (playerHealth <= 0) {
            println("Game over.")
            
        }
        println("Current Health: $playerHealth")
    }
    
    
    
     //Page 58 
    println("Page 58")
    val condition = true
	val result3 = if (condition) {
    	"Condition is true"
	} else {
   		"Condition is false"        
	}
    println(result3)
    
    //Page 59
    println("Page 59")
      val size = 5
    val array = createFilledArray(size, -1)

    println("Filled Array with -1:")
    array.forEachIndexed { index, value ->
        println("Index $index: $value")
    }
    
    //Page 60
    println("Page 60")
     println("Square of 5 is: ${square(5)}")
     println("Also square of 6 is: ${square2(6)}")
     
     
     //Page 61  -with
     println("Page 61:")
     
     val person = Fellas("Wirt", 30)
    
        with(person) {
            idName = "Beatrice"
            age = 25
        }
        println("Name: ${person.idName}, Age: ${person.age}")
        
        //Page 62  -apply
        println("Page 62:")
        
        val person2 = Fellas("Greg", 20)
    
        person2.apply {
            idName = "Sara"
            age = 25
        }
    
    println("Name: ${person2.idName}, Age: ${person2.age}")
    
    //Page 64   -generic type
    println("Page 64:")
    val rpgGame = Games("The Witcher 3", "RPG")
    val rpgTitle = rpgGame.getTitle()
    val rpgGenre = rpgGame.getGenre()
    println("Title: $rpgTitle, Genre: $rpgGenre")
    
    //Page 65 -also
    println("Page 65:")
    
    val message = "Allons-y alonso!"

    val modifiedMessage  = message.also {
        println("Original message: $it")
    }.uppercase()

	println("Modified message: $modifiedMessage")
    
     //Page 67 -
    println("Page 67:")
    
    val rectangleArea = calculateAreaOfRectangle() // Default length (1.0) and width (1.0)
    println("Area of rectangle with default length and width: $rectangleArea")

    val customRectangleArea = calculateAreaOfRectangle(length = 4.0, width = 2.5) // Custom length and width
    println("Area of rectangle with custom length and width: $customRectangleArea")
    
    
	 //Page 68 - -infix
    println("Page 68:")
    val returnValue = 5 customIsGreaterThan 3
    println(returnValue) 
    
    //Page 69 -operator functions
    println("Page 69:")
    val point1 = Point(3.0, 4.0)
    val point2 = Point(1.5, 2.5)

    val sum = point1 + point2
    println("Point sum: (${sum.x}, ${sum.y})")
    
    //Page 70 -vararg parameters
    println("Page 70:")
    val outPut = concatenateStrings("Hello", "from", " The other side")
    println("Concatenated string: $outPut")
    
    
   // pages 71 to 83 already done on other pages
   println(" pages 71 to 83 already done on other examples")
   
   //Page 84
   println("Page 84")
   
   var c = 0

    do {
        println("c değeri: $c")
        c += 2
    } while (c < 10)
    
    //Page 88
    println("Page 88:")
   val coordinate1 = Coordinate(3, 4)
    val coordinate2 = Coordinate(3, 4)
    val coordinate3 = coordinate1

    println(coordinate1 == coordinate2)  // true - Returns true because their values are the same
    println(coordinate1 === coordinate2) // false - Returns false because they have different references in memory

    println(coordinate1 == coordinate3)  // true - Returns true because their values are the same
    println(coordinate1 === coordinate3) // true - Returns true because they have the same reference in memory memory
    
    
 //Page 90 to 92 -data classes
   println("Page 90-92")  
   // data classes already done on page 12 and page 37
    println("data classes already done on page 12 and page 37")
        
}


//page 10
fun calculateAverage(a: Float, b:Float){
    println("average of a and b: ${(a+b)/2}")
}

//page 12
class Game (val name: String, val releaseDate:Int){
    val message = ("$name was released on $releaseDate")
}

//page 13
open class Flower{
    open fun color(){
        println("Every flower has a color")
    }
}

class Lily (val flowerColor: String): Flower(){
    override fun color(){
        println("lilies are $flowerColor")
    }
}

//page 15

fun checkTemperature(temperature: Double) {
    if (temperature < 0) {
        println("It's freezing out there, you better stay home")
    } else if (temperature in 0.0..25.0) {
        println("It's chilly out there,dress lightly")
    } else {
        println("It's hot out there. Stay hydrated")
    }
}

//page 21

fun checkNull(obj: String?) {
    if (obj == null) {
        println("obj is null")
    } else {
        println("obj is not null")
    }
    
}

//page 22

fun printObjectType(obj: Any) {
    when (obj) {
        is String -> println("Object is a String")
        is Int -> println("Object is an Int")
        is Double -> println("Object is a Double")
        is Boolean -> println("Object is a Boolean")
        else -> println("Object has an unknown type")
    }
}

//page 37

data class StudentDTO(
    val id: Long,
    val name: String,
    val grade: Int
)

//page 38
fun welcome(
    first: String ="Howdy", 
    second: String ="Partner"
){
    println("$first $second")
    
}

//page 45
class LazyProperty{
    val lazyProperty: String by lazy {
        println("Property initialized!") 
        "Lazy Value" 
    }
}

//page 46
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

//page 47
object Singleton {
    init {
        println("Singleton instance initialized.")
    }
    
    fun doSomething() {
        println("Singleton is doing something.")
    }
}

//page 48
abstract class Vehicle {
    
    val brand: String
    val color: String
    
    
    constructor(brand: String, color: String) {
        this.brand = brand
        this.color = color
    }
    
    
    abstract fun start()
}


class Car(brand: String, color: String) : Vehicle(brand, color) {
    override fun start() {
        println("$color $brand car is starting.")
    }
}


class Motorcycle(brand: String, color: String) : Vehicle(brand, color) {
    override fun start() {
        println("$color $brand motorcycle is starting.")
    }
}

//Page 59

fun createFilledArray(size: Int, fillValue: Int): IntArray {
    return IntArray(size) { fillValue }
}

    //Page 60
    fun square(d: Int) = d * d

//This is equivalent to:
	fun square2(f: Int): Int {
    return f * f
}
    

    
 //Page 61
 data class Fellas(var idName: String, var age: Int)
 
 //Page64
 class Games<T>(private val title: String, private val genre: T) {
    fun getTitle(): String {
        return title
    }

    fun getGenre(): T {
        return genre
    }
}
 
 //Page 67
 fun calculateAreaOfRectangle(length: Double = 1.0, width: Double = 1.0): Double {
    return length * width
}
 
 //Page68 
 infix fun Int.customIsGreaterThan(other: Int): Boolean {
    return this > other
}
 
 //Page 69
 class Point(val x: Double, val y: Double) {
    operator fun plus(other: Point): Point {
        return Point(this.x + other.x, this.y + other.y)
    }
}
 
 //Page 70
 fun concatenateStrings(vararg strings: String): String {
    return strings.joinToString(separator = " ")
}
 
 //Page 88
data class Coordinate(val x: Int, val y: Int)

