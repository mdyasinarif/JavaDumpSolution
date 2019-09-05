/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION27;

class A{

    public  A() {
        System.out.println("A ");
    }

}
class B extends A{

    public  B() {
        System.out.println("B ");
    }


}
public class C extends B{

    public C() {
        System.out.println("C ");
    }
    public static void main(String[] args) {
//        A a = new B();
//        B b = new B();
        C c = new C();
    }
}
