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
public class ExceptionTest {
    public static int method1(int v) throws Exception {
        try {
            return method2(v);
        } catch (LocalException e) {
            return 100;
        }
    }
    
    public static int method2(int v) throws Exception {
    if (v == 0)
        throw new Exception("A");
    if (v >= 0)
        throw new LocalException("B");
    return 5; 
    }
    
    public static void main(String[] args) { 
        /*
        try {
            int val = ExceptionTest.method1(0);
            System.out.println("Val:" + val);
            System.out.print("the main method try block works");
            //THE TRY DOESN'T WORK HERE
        } catch (Exception e) {
            //System.out.print(e);
            System.out.print("Exc: " + e);
        }
        */
        
        try {
            int val= ExceptionTest.method1(1);
            System.out.print("Val:" + val);
        } catch (Exception e) {
            System.out.print("Exc:" + e.getMessage());
        } finally {
            System.out.print(":Done");
}         
    }     
}    
