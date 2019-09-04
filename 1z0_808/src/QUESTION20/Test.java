/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION20;

import QUESTION22.*;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        int x = 5;
        while (isAvailable(x)) {            
            System.out.println(x);
            x--;
        }
    }
    public static  boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }
}
