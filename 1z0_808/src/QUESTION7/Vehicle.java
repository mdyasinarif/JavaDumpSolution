/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION7;

/**
 *
 * @author hp
 */
public class Vehicle{
String type = "4w";
int maxSpeed = 100;

    public Vehicle() {
    }
     Vehicle(String type,int maxSpeed) {
         this.type = type;
         this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle{
    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type,  String trans,  int maxSpeed) {
        super(type, maxSpeed);
        this.trans = trans;
    }
    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4w", "Manual", 150);
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
    
}
