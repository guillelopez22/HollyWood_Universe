/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Stack;

/**
 *
 * @author isaac
 */
public class Historial {
   public static Stack<String> history = new Stack();
    public void setHistorial(String operacion){
        history.push(operacion);
    }
    
    public void deleteHistorial(String operacion){
        history.pop();
    }
    
    public String seeHistorial(){
        return history.peek();
    }
    
    public boolean isEmpty(){
        return history.isEmpty();
    }
}
