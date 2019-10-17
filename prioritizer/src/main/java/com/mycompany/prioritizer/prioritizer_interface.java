/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prioritizer;
import java.util.ArrayList;
/**
 *
 * @author mohammed
 */
public interface prioritizer_interface <T> {
    public void insert(T param1);
    public void changePhase();
    public void removeNextInOrder();
    public void removeAny(T param2);
    public int size();
    public boolean isInInsertionPhase();
}
