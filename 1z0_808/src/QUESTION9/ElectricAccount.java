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
public class ElectricAccount {
    private double kwh;
    private double rate = 0.7;
    private double bill;
    
   public void addKWH(double kwh){
    this.kwh += kwh;
    this.bill =  this.kwh*this.rate;
    }
    
}
