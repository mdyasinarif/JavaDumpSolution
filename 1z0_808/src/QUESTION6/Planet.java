/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION6;

/**
 *
 * @author hp
 */
abstract class Planet {
    protected void revolve(){}
    abstract void rotate();
}
class Earth extends Planet{
public void revolve(){}
//protected void revolve(){}
    @Override
    void rotate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}