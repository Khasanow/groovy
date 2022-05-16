def printHello(){
    println("helloGroovy :)")
}
printHello()

def sum(int a,int b){
    println("Sum is "+(a+b))
}
sum(2,4)

def sub(int a,int b){
    def c=a-b
    return c
}
def result =sub(5,3)
println("result: "+result)