package com.mycompany.hashtableadt;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTableADT<T> extends Nodo<T> {
    HashMap diccionario;
    ArrayList arregloY;
    Nodo node1;
    int tableSize;
    T key;
    T value;
    int indice;
       
    public HashTableADT(int tableSize){
        this.tableSize=tableSize;
        arregloY= new ArrayList(tableSize);
        for (int i = 0; i < arregloY.size()-1; i++) {
            diccionario= new HashMap();
        }                                        
    }
    
    public void add(int key, T value){
        indice= key % tableSize;
        node1 = new Nodo(diccionario.put(key, value), null);
        arregloY.add(indice,node1);
                     
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
        return arregloY;
    }

    public void setArreglo1(ArrayList arregloY) {
        this.arregloY = arregloY;
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
