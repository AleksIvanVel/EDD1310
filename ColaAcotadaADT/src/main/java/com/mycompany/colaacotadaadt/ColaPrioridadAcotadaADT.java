package com.mycompany.colaacotadaadt;

import java.util.ArrayList;

public class ColaPrioridadAcotadaADT<T> {
    ArrayList colaAcotada;
    ArrayList prioridad;
    
    public ColaPrioridadAcotadaADT(int niveles){
        colaAcotada=new ArrayList();
        prioridad= new ArrayList(niveles);
    }
    
    public boolean isEmpty(){
        boolean estado=true;
        for (int i = 0; i <prioridad.size(); i++) {
            prioridad.get(i);
            for (int j = 0; j < colaAcotada.size(); j++) {
                if (colaAcotada.get(j)==null) {
                    estado=true;
                }
            }
        }
        return estado; 
    }
    
    public int length(){
        return colaAcotada.size();
    }
    
    public void enqueue(int priority, T elemento){
        for (int i = 0; i <= priority; i++) {
            prioridad.get(i);
            colaAcotada.add(elemento);    
        }
    }
    
    public T dequeue(){
        prioridad.get(0);
        T sacado= (T) colaAcotada.remove(0);
        return sacado;
    }
    
}
