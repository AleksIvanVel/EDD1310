package com.mycompany.colaacotadaadt;

import java.util.ArrayList;

public class ColaADT<T> {
    ArrayList cola;
    
    public ColaADT(){ //Constructor 
         cola = new ArrayList(); 
    }
    
    public boolean isEmpty(){
        return cola.isEmpty();
    }
    
    public int length(){
        return cola.size();
    }
    
    public void enqueue(T elemento){
        cola.add(elemento);
    }
    
    public T dequeue(){
        T sacado;
        sacado = (T) cola.remove(0);
        return sacado;
    }

    @Override
    public String toString() {
        String estado="";
        for (int i = 0; i < cola.size(); i++) {
            estado += cola.get(i) + ", ";  
        }
        return estado;
    }
}
