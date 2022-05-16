package o220pEx5

 abstract class Car {
     String name;
     String color;
     int model;

     def startEngine(){
         println("Engine startes for $name")
     }
     abstract def topSpeed();




}
