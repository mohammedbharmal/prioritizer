/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prioritizer;
import java.util.*;

/**
 *
 * @author mohammed
 */
public class prioritizer3<T> implements prioritizer_interface<T> {

    ArrayList<T> arr = new ArrayList<>();
    boolean isInInsertion = true;
    
    @Override
    /*
    * @pre isInInsertion == true
    */
    public void insert(T param1) {
        arr.add(param1);
    }

    @Override
    public void changePhase() {
        isInInsertion = false;
    }

    @Override
    /*
    * @pre isInInsertion == false
    * @pre arr.size() > 0
    */
    public void removeNextInOrder() {
        if (!isInInsertion) {
            arr.remove(0);
        }
        else {
            System.out.println("Not in insers=tion phase");
        }
    }

    @Override
    /*
    * @pre isInInsertion == false
    * @pre arr.size() > 0
    */
    public void removeAny(T param2) {
        if (!isInInsertion) {
            arr.remove(param2);
        }
        else {
            System.out.println("Not in insers=tion phase");
        }
        
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean isInInsertionPhase() {
        return isInInsertion == true ? true : false;
    }
    
}
