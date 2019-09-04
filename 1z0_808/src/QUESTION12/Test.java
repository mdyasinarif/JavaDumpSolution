/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION12;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        String ta = "A ";
        ta = ta.concat("B ");// a b
        String tb = "C ";
        ta = ta.concat(tb);// a b c
        ta.replace('C', 'D');// a b c no change
//        ta = ta.replace('C', 'D');// a b d
        ta = ta.concat(tb); // a b c c 
        System.out.println(ta);
    }
    
}
