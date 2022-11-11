package com.mycompany.adtpila;

import java.util.ArrayList;

public class Pila<T> {
    ArrayList<T> datos;
    int longitud;

    public Pila(){
        datos = new ArrayList();
    }
    
    public  boolean isEmpty(){
        return datos.isEmpty();
    }
    
    public int getLength(){
        return datos.size();
    }
    
    public T pop(){
        int tope = datos.size()-1;
        T sacado= datos.remove(tope);
        tope--;
        return sacado;
    }
    
    public T peek(){
        int tope;
        tope= datos.size()-1;
        T DatoConsulta=datos.get(tope);
        return DatoConsulta;       
    }
    
    public void push(T dato){
        datos.add(dato);
        int tope=datos.size()-1;
    }

    @Override
    public String toString() {
        String edo="";
        for (int i = datos.size()-1; i <= 0; i--) {
            edo += datos.get(i) + "\n";
        }
        return edo;
    }
    
    
}
