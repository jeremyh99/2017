/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta2017;

import java.util.ArrayList;
import java.util.List;

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
    
    public static void main(String[] args) {     
        /*
        ArrayList<Person> a= new ArrayList<Person>();
        a.add(new Person("Cal",3));
        a.add(new Person("Bob",2));
        a.add(new Person("Ann",1));
        List<Object> al= new ArrayList<Object>(a);
        for (Object o : al)
        System.out.print("["+ o + "]"); 
        */
        Organization o = new Organization("Org");
        o.addPerson(new Person("Cal",3));
        o.addPerson(new Person("Bob",2));
        o.addPerson(new Person("Ann",1));
        System.out.print("["+ o + "]"); 
    }    
}
