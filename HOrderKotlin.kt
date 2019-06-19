//Author: Yves Guillaume A Messy

/* The bellow function definition example and result, display the use of a higher order function
 * with a lambda expression defined on the fly. It's meant to be an example of how to use this type
 * in Kotlin */

fun main(args: Array<String>) {

val yvesLambdaFunc: (Int, Int ) -> Int = { x , y -> x + y }

 addition(8, 9, yvesLambdaFunc)

}


fun addition(a: Int, b: Int, yvesLambdaFunc:(Int, Int) -> Int ) {
    
    var result = yvesLambdaFunc(a , b)
    
    print(result)
    
}
