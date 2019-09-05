/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION25;

/**
 *
 * @author hp
 */
public class Employee {
    String name;
    boolean contract;
    double salary;

    public Employee() {
//        this.name = "Joe";
//        this.contract = true;
//        this.salary = 100;

//        this.name = new String("Joe");
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);

//        name = "Joe";
//        contract = true;
//        salary = 100;




    }

    @Override
    public String toString() {
       
        return name+":"+contract+":"+salary;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Joe";
        e.contract = true;
        e.salary = 100;
        
         
        
        System.out.println(e);
    }
    
}
