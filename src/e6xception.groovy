//exceptiom handling
try {
    int i = 1/1
}catch(ArithmeticException exp1){
    println("catch block to catch Arithmetic exp")
}catch(ArithmeticException exp){
    println("i'm inside exception block")
    println(exp.getCause())
    println(exp.getMessage())
//    exp.printStackTrace()
}finally{
    println("i'm inside finally block")
}
println("another set of code")