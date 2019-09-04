/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION17;

/**
 *
 * @author hp
 */
public class CheckingAccount {

//    public static  int amount;
    public int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000));
//        this.amount = 0; // complie error
//        amount = 0; // static varibale can be declear
//        acct(0); // complie error
        acct.amount = 0;
//        acct.getAmount();// give random number
//       acct.changeAmount(0);// give random number
        acct.changeAmount(-acct.amount);
        acct.changeAmount(-acct.getAmount());

        System.out.println(acct.getAmount());
    }
}
