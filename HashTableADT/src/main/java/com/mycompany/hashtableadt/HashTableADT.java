package com.mycompany.hashtableadt;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTableADT<T> {
    HashMap diccionario;
    ArrayList arreglo1;
    int tableSize;
    T key;
    T value;
    int indice;
       
    public HashTableADT(int tableSize){
        this.tableSize=tableSize;
        arreglo1= new ArrayList(tableSize);
        for (int i = 0; i < arreglo1.size()-1; i++) {
                diccionario= new HashMap();                   
        }
    }
    
    public void add(T key, T value){
        indice= key % tableSize;
        for (int i = 0; i < indice; i++) {
            arreglo1.set(indice, diccionario.put(key, value));         
        }
    }
    
    public T valueOf(T key){
        T valor;
        valor=(T) diccionario.get(key).toString();
        return valor;
    }
    
    public void remove(T key){
        diccionario.remove(key);
    }
    
       public HashMap getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(HashMap diccionario) {
        this.diccionario = diccionario;
    }

    public ArrayList getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(ArrayList arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
