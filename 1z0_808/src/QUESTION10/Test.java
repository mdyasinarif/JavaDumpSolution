/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION10;

/**
 *
 * @author hp
 */
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if(sb.toString().equals(s)){
            System.out.println("Match 2");
        }else{
            System.out.println("No Match");
        }
    }
}
