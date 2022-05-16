package o19opEx3

import o18opEx2.Car

class CarObject extends Car{
    static void main( args) {
        CarObject toyota=new CarObject()
        CarObject ford=new CarObject()
        CarObject mercedes=new CarObject()

        toyota.name="Toyota"
        toyota.model=2022
        toyota.color="Black"

        ford.name="Ford"
        ford.model=2021
        ford.color="Blue"

        mercedes.name="Mercedes"
        mercedes.model=2020
        mercedes.color="Red"

        toyota.getCarDetails()
        toyota.startEngine()
        println('=============')
        ford.getCarDetails()
        ford.startEngine()
        println('=============')
        mercedes.getCarDetails()
        mercedes.startEngine()
    }
}
