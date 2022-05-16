def range=1..10
println(range)
println(range.size())
println(range.getTo())
assert range.from==1
assert range.to==10
println(range.get(3))
println(range[3])
println range.contains(6)
println(range.isReverse())
println("---------------------------------------------")
def range2=range.subList(3,8)
println(range2.getFrom())
println(range2.getTo())
println("---------------------------------------------")
//iterate on a range
for (i in range) {
    print(i)
}
println()
(1..10).each {i->
    println("Value = $i")
}
println()
println()
range.each {i->
    println("Value = $i")
}
println(range instanceof java.util.List)