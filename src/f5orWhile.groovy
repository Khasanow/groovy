//for
for (int i=1;i<5;i++){
    print(i)
}

println()

for (int i=1;i<=5;i++){
    print(i)
}

println()

int q=1
for (q;q<=4;q++){
    print(q)
}
println()

println("-----------------------------")
//for in
for (w in 1..7){
    print(w)
}

println()

1.upto(6){
    print"$it"
}

println()

5.times {
    print("$it")}

println()

1.step(10, 2){
    print("$it")
}

println()

for (e in [0,1,2,3,4,5]){
    print(e)
}

println()
println("-----------------------------")
//iterate over a map
def map=["name":"Groovy","subject":"Automation"]

for (z in map){
    print(z.key+":")
    println(z.value)
}

println()

int r=2
while (r<=8){
    print(r)
    r=r+1
}