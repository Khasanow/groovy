def str="hello "
def myClosure1={name -> println("$str $name")}
myClosure1.call("Arny")
println("--------------------------------------------")
def myMethod(clos){
    clos.call("Groovy")
}
myMethod(myClosure1)
println("--------------------------------------------")
def myClosure2={
    a,b,c->
        return (a+b+c)
}
def res=myClosure2(12,13,14)
println(res)
println("--------------------------------------------")
def myList1=["apples","orange","grapes"]
println(myList1.each {it})
println("--------------------------------------------")
def myMap=[
        'subject':'groovy',
        'topic'  :'closure',
]
println(myMap.each {it})
println("--------------------------------------------")
def myList=[1,2,3,4,5,6,7]
println myList.find{item->item==3}
println myList.findAll{item->item>2}
println myList.any{item->item>3}
println myList.every{item->item>1}
println(myList.collect{item->item*2})