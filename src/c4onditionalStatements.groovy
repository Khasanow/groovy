def num=11
if (num==10){
print("num is 10")
}
else {
    println("num is not 10")
}
println("--------------------------------")
def num1=1
if (num1>0)
    println "num1 is +ve"
else
    println "num is -ve"
println("--------------------------------")
def num2=0
if (num2>0)
    println "num2 is +ve"
else if (num2==0)
    println "num2 is zero"
else
    println "num is -ve"
println("--------------------------------")
//switch-case
def x=1.4
def result=""
switch (x){
    case 0:
        result="x is zero"
        break
    case {x>0}:
        result="x is +ve"
        break
    case {x<0}:
        result="x is -ve"
        break
    default:
        result="invalid number"
}
println result
