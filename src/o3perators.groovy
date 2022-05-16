/*
assert 1+2==3
assert 4-3==1
assert 3*5==15
assert 3/2==1.5
assert 10%3==1
assert 2**3==8
assert 9.intdiv(5)==1
println('----------------------------------')
//unary operators
assert +3==3
assert -4==0-4
assert -(-1)==1
println('----------------------------------')
//increment ++ and decrement --
int q=10
println q++//10
println q  //11
println (++q)
println('----------------------------------')
def a=2
def b=a++*3
assert a==3 && b==6

def c=3
def d=c--*2
assert  c==2 && d==6

def e=1
def f=++e+3
assert e==2 && f==5

def g=4
def h=--g+1
assert g==3 && h==4
println('----------------------------------')
*/

//assignment arithmetic operators

/*
def a=4
a +=3//a=a+3
println(a)
assert a==7

def b=5
b-=4//b=b-4
println(b)
assert b==1

def c=7
c*=3//c=c*3
println(c)
assert c==21
println('----------------------------------')

 */
//relation operators
assert 1+2==3
assert 3!=5

assert -2<3
assert 2<=2
assert 3<=4

assert 4>1
assert 5>=-1

//logical operators
assert !false
assert true && true
assert true || false

//precedence
assert (!false && false) == false
assert true || true && false

//bitwise operators
/*
int a=20
int b=25
println(a & b)
println(Integer.toBinaryString(a))//10100
println(Integer.toBinaryString(b))//11001
                                  //10000
println(Integer.parseInt("10000",2))
 */

//condition operators
assert (!true)==false
assert (!'foo')   == false
assert (!'')      == true


//ternary operator
def output1 = (1>0)?"1 is greater":"1 is not greater"
print(output1)