import java.nio.channels.FileLock

def x=12
def y=13
println x
println y
println("----------------------------------")
def (a,s,d)=[20,10,30]
println((a+d-s)*2)
println('----------------------------------')
def z=(((-x/s)*(y*d))/((-y+d)/2)*(0.5+a))
def q=(((x/s-s)*(y*d))/((y-d)/2)*(0.5+a))
println(z.getClass().getName())
println z
println q
println('----------------------------------')
//byte
byte b=1
println(b.getClass().getName())
println(b)
println("byte_min: " + Byte.MIN_VALUE + " byte_max: " + Byte.MAX_VALUE)
println('----------------------------------')
//short
short w=22
println(w.getClass().getName())
println(w)
println("short_min: " + Short.MIN_VALUE + " short_max: " + Short.MAX_VALUE)
println('----------------------------------')
//int
int r=333
println(r.getClass().getName())
println(r)
println("Integer_min: " + Integer.MIN_VALUE + " Integer_max: " + Integer.MAX_VALUE)
println('----------------------------------')
//long
long t=4444L
println(t.getClass().getName())
println(t)
println("Long_min: " + Long.MIN_VALUE + " Long_max: " + Long.MAX_VALUE)
println('----------------------------------')
//float
float u=5.000005F
println(u.getClass().getName())
println(u)
println("Float_min: " + Float.MIN_VALUE + " Float_max: " + Float.MAX_VALUE)
println('----------------------------------')
//double
double i=666666.000006
println(i.getClass().getName())
println(i)
println("Double_min: " + Double.MIN_VALUE + " Double_max: " + Double.MAX_VALUE)
println('----------------------------------')
//char
char o='7'
println(o.getClass().getName())
println("char: "+o)

println('----------------------------------')
//Boolean
boolean p=true
boolean pp=false
println(p.getClass().getName())
println(p)
println(pp)
println('----------------------------------')
//String
String f='hello groovy'
println(f.getClass().getName())
println(f)
println f
println('----------------------------------')

