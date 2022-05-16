package o17opEx1

class Student {
    String name;
    int sub1Marks;
    int sub2Marks;
    def printTotal(){
        println("$name has total marks = "+(sub1Marks+sub2Marks))
    }


    static void main(args){
        Student student1=new Student()
        student1.name="Jo"
        student1.sub1Marks=1
        student1.sub2Marks=2
        student1.printTotal()
        Student student2=new Student()
        student2.name="Mark"
        student2.sub1Marks=4
        student2.sub2Marks=3
        student2.printTotal()

    }
}
