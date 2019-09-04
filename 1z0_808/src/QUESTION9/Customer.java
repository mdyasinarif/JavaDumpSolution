/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION9;

/**
 *
 * @author hp
 */
public class Customer {
    ElectricAccount acct = new ElectricAccount();
    
    public  void useElectricity(double kw){
    acct.addKWH(kw);
    }
}
