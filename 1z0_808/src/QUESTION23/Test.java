/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION23;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a<b)?(a<c)? a:b :(b<c)? b:c;
        System.out.println(d);
    }
}
