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
public class Person {
    private String _name;
    private int _salary;
    
    public Person (String name, int salary) {
    _name = name;
    _salary = salary;
    }
    
    public String getName() {
    return _name;
    }
    
    public int getSalary () {
    return _salary;
    }
    
    @Override
    public String toString() {
        return _name + ":" + _salary;
    }
}
