/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta2017;
import java.util.ArrayList;
/**
 *
 * @author jeremyhodgson
 */
public class Organization {
    private String _name; //this member is **private**
    protected ArrayList <Person> _people;
    
    public Organization (String name) {
        _name = name;
        _people = new ArrayList <Person>();
    }
    
    public void addPerson (Person p) {
        _people.add(p);
    }
    
    @Override
    public String toString() {
        return _name + "::" + totalPersonnelCost();
    }
    
    //this method is PRIVATE
    private int totalPersonnelCost() {
        int total_cost = 0;
        for (Person p : _people)
            total_cost += getPersonnelCost(p);
        return total_cost;
    }
    
    protected int getPersonnelCost(Person p) {
        return p.getSalary();
    }
}
