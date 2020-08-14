class Launcher {

    // regular variables
    val num = 10
    
    fun main(args: Array<String>) {
        
        // data type variables
        val position : Vector3 = Vector3(0, 10, 0)
        val message : String = "hello"

        print(position.x.toString() + " " + position.y.toString() + " " + position.z.toString())
    }
}

// example class
class Vector3 {

    var x = 0
    var y = 0
    var z = 0

    constructor(x : Int, y : Int, z : Int) {
        this.x = x
        this.y = y
        this.z = z
    }
}
