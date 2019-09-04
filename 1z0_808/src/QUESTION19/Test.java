/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION19;

import java.io.FileNotFoundException;


public class Test {
    void readCard(int cardNo)throws RuntimeException{
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo)throws Exception{
        System.out.println("Checking Card");
    }
    public static void main(String[] args) throws Exception  {
        Test ex = new Test();
        int cardNo = 12344;
        ex.checkCard(cardNo);
        ex.readCard(cardNo);
    }
    
}
