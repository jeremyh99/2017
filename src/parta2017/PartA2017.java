/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jeremyhodgson
 */
public class PartA2017 {
    public static void main(String[] args) { 
        /* 1.)
        HashMap<String,Integer> ages = new HashMap<String,Integer>();
        //HashMap = (key, value)
        ages.put("Bob", 25);
        ages.put("Ann", 23);
        ages.put("Bob", 24); //this replaces the first Bob, 25 
        System.out.println(ages); //{Ann=23, Bob=24} 
        Integer bob_age = ages.get("Bob");
        ages.put("Cal", bob_age == null? 1 : bob_age + 1); //cond ? exprtrue : exprfalse 
        //the condition is false, therefore bob_age + 1 is evaluated
        ages.remove("Ann");
        ages.remove("Bob");
        for (String s : ages.keySet ())
        System.out.print(s + "->" + ages.get(s)); //get is a default method for HashMaps
        //the get method refers to a key and returns its value
        */
        
        /* 2.)
        TreeSet<Integer> ts= new TreeSet<Integer>();
        // elements get stored in ascending order
        ts.add(10);
        ts.add(10); //duplicates will not get inserted
        while (true) { //while (condition) { code block to be executed }
        ts.add(ts.size()*2);
        if (ts.size() > 4)
        break;
        }
        for (Integer i : ts)
        System.out.print(i + ":");     
        */
        
        /* 3.)        
        //A a = new A();
        //object a will call the constructor of A
        //runs through constructor -> init method -> run method = "1" + "A"
        //so we currently have 1A
        //B b = new B();
        //will call the super constructor first
        //
        //21B 
        //Answer = 1A21B
        */
        
        /* 4.)
        A a = new B(); //object a will be overriden in class B
        //object of subclass calls constructor of its own class AND also its superclass
        //21BB
        //a, an object of subclass B will call the constructor in
        //the superclass A first.
        //the constructor in A is init() which is overridden in B. So we print 2 first
        //init() in B tells us to run()
        //run() is in A and it tells us to print "1" + this
        //so we print 1 first, now we have 21
        //"this" refers to the current object, a
        //we know from earlier, a is an object of subclass B
        //so we will print this (without calling the constructor this time)
        //Override toString in class B returns "B"
        //now we have 21B
        //finally, we have finished running the super constructor
        //now we run the subclass constructor in B which is empty
        //so nothing happens
        System.out.print(a); //calls the toString method in B which returns "B"
        //now we have 21BB
        
        //toString() returns a string representation of the object
        
        B b = (B)a; //this prints nothing
        //what does (B)a mean???
        //this is casting part...it only prints out B
        System.out.print(b);
        //not sure what this means but I know it has to print B
        //Answer = 21BBB
        */
        
        /* 5.)        
        Pattern p = Pattern.compile("[A-Z]?[^A-Za-z][a-z]+");
        String haystack = "A Crikey's GOT ME!";
        Matcher m = p.matcher(haystack);
        while (m.find())
            //if(m.group().length() != 0)
            //System.out.print(m.group().trim());
            System.out.format(" [%d,%d]", m.start(), m.end()); 
            
        */
        
        //* 9.)       

        
    }
}
