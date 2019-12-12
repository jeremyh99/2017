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
public class A {
    
    public A() {
        init();
    }
    
    public void init() {
        run();
    }
    
    public void run() {
        System.out.print("1" + this);
    }
    
    @Override
    public String toString() {
        return "A";
    }
}
