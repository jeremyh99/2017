/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta2017;

/**
 *
 * @author jeremyhodgson
 */
public class B extends A{
    
    public B() {
        super();
        System.out.print("after super");
    }
    
    @Override
    public void init() {
        System.out.print("2");
        run();
    }
    
    @Override
    public String toString() {
        return "B";
    }
            
}
