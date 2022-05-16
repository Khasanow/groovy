def name="Michael"
println(name)
println("my name is "+name)
println("my name is ".concat(name))
println("my nzme is $name")
println('my name is $name')
println('my name is ${name}')
println("--------------------------------------")
def s1="""this is a groovy class
and we are learning strings"""
def ss1='''this is a groovy class
and we are learning strings'''
println(s1)
println()
println(ss1)
println()
println(name.length())
println(name[2])
println(name[-2])
println(name.indexOf('h'))
println(name[0..3])
println(name[2..5])
println(name[0,3,5])
println(name.substring(3))
println(name.subSequence(2,4))
println("--------------------------------------")
def str = "This is a Groovy class"
println(str.split(" "))
println(str-("groovy"))
println(str.replace("class","session"))
println(str.toLowerCase())
println(str.toUpperCase())
println(str.toList())
println("Groovy "*4)
println("ABC".equals(str))
println(str.equals(str))
println("qwe".equals("qwe"))
println("qWe".equalsIgnoreCase("qwe"))
println("--------------------------------------")
def name2="Karl"
def s2=/a green sky $name2/
def s3=$/a blue tree 
                            $name2/$
println(s2)
println(s3)

def s4="my name is \"Max\""
println(s4)

def s5=/my name is "Jo"/
println(s4)

