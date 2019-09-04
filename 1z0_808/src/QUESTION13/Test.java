/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION13;

class CD {

    int r;

    public CD(int r) {
        this.r = r;
    }
}

class DVD extends CD{

   int c;

    public DVD(int c, int r) {
        super(r);
        this.c = c;
//        System.out.println(c);
//        System.out.println(r);
    }
   

}

public class Test {
    public static void main(String[] args) {
        DVD dvd = new DVD(10, 20);
        
       
    }

}
