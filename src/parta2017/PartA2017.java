/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta2017;

import java.util.HashMap;

/**
 *
 * @author jeremyhodgson
 */
public class PartA2017 {
    public static void main(String[] args) {   
    HashMap<String,Integer> ages = new HashMap<String,Integer>();
    ages.put("Bob", 25);
    ages.put("Ann", 23);
    ages.put("Bob", 24);
    
    Integer bob_age = ages.get("Bob");
    ages.put("Cal", bob_age == null? 1 : bob_age + 1);
    ages.remove("Ann");
    ages.remove("Bob");
    for (String s : ages. keySet ())
    System.out.print(s + "->" + ages.get(s));
    }
}
