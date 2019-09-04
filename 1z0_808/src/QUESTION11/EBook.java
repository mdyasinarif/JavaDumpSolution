/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION11;

interface Readable{
    public void readBook();
    public void setBookMark();
}

abstract class Book implements Readable{
    public void readBook() {
    }

   
    
}


public class EBook extends Book{
    public void readBook(){}
    @Override
    public void setBookMark() {
    }
    
}
