package com.mycompany.colaacotadaadt;

import java.util.ArrayList;

public class ColaPrioridadAcotadaADT<T> extends ColaADT<T> {
    ArrayList prioridad;
    
    public ColaPrioridadAcotadaADT(int niveles){
        
        prioridad= new ArrayList(niveles);
        for (int i = 0; i < prioridad.size()-1; i++) {
            ColaADT<T> cola = new ColaADT();
            prioridad.add(cola);     
        }
    }
    
    public boolean isEmpty(){
        boolean estado=true;
        for (int i = 0; i <prioridad.size()-1; i++) {
            prioridad.get(i);
            for (int j = 0; j < cola.size()-1; j++) {
                if (cola.get(j)==null) {
                    estado=true;
                }
            }
        }
        return estado; 
    }
    
    public int length(){
        return cola.size();
    }
    
    public void enqueue(int priority, T elemento){
        for (int i = 0; i <= priority; i++) {
            prioridad.get(i);
            cola.add(elemento);    
        }
    }
    
    public T dequeue(){
        prioridad.get(0);
        T sacado= (T) cola.remove(0);
        return sacado;
    }
    
}
