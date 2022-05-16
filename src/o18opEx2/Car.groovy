package o18opEx2

class Car {
    String name;
    String color;
    int model;

    def getCarDetails(){
        println("you are driving $model,$color colored $name")
    }
    def startEngine(){
        println("Start engine for $name")
    }

//    static void main(args) {
//        Car toyota=new Car()
//        Car ford=new Car()
//        Car mercedes=new Car()
//
//        toyota.name="Toyota"
//        toyota.model=2022
//        toyota.color="Black"
//
//        ford.name="Ford"
//        ford.model=2021
//        ford.color="Blue"
//
//        mercedes.name="Mercedes"
//        mercedes.model=2020
//        mercedes.color="Red"
//
//        toyota.getCarDetails()
//        toyota.startEngine()
//println('=============')
//        ford.getCarDetails()
//        ford.startEngine()
//        println('=============')
//
//        mercedes.getCarDetails()
//        mercedes.startEngine()
//    }
}
