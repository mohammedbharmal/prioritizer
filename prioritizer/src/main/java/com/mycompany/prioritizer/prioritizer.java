/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prioritizer;

/**
 *
 * @author mohammed
 */
public class prioritizer {
    public static void main(String argsp[]) {
        prioritizer1<Integer> p1 = new prioritizer1<>();
        
        p1.insert(5);
        p1.insert(2);
        p1.insert(8);
        p1.insert(6);
        p1.insert(10);
        
        p1.changePhase();
        
        p1.removeAny(10);
        p1.removeNextInOrder();
        
        for(Integer i: p1.arr) {
            System.out.println(i);
        }
        
        System.out.println("******************");
        
        prioritizer2<Integer> p2 = new prioritizer2<>();
        
        p2.insert(5);
        p2.insert(2);
        p2.insert(8);
        p2.insert(6);
        p2.insert(10);
        
        p2.changePhase();
        
        p2.removeAny(10);
        p2.removeNextInOrder();
        
        for(Integer i: p2.arr) {
            System.out.println(i);
        }
        
        System.out.println("******************");
        
        prioritizer3<Integer> p3 = new prioritizer3<>();
        
        p3.insert(5);
        p3.insert(2);
        p3.insert(8);
        p3.insert(6);
        p3.insert(10);
        
        p3.changePhase();
        
        p3.removeAny(10);
        p3.removeNextInOrder();
        
        for(Integer i: p3.arr) {
            System.out.println(i);
        }
    }
}
