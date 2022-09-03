package com.mycompany.clasearreglo;
import java.util.ArrayList;

public class Arreglo<T>{
    int tamanioArray;
    ArrayList<T> elementos;

    public Arreglo(int tamanioArray){ //constructor del array
        this.tamanioArray = tamanioArray;
        elementos = new ArrayList();
        for (int i=0; i<this.tamanioArray; i++){
            elementos.add(null);
        }
    }

    public int getLongitud(){
         return this.tamanioArray;
    }

    public T getElemento(int indice) throws IndexOutOfBoundsException{//agregar elemento
      return elementos.get(indice);
    }

    public void setElemento(int indice, T dato) throws IndexOutOfBoundsException{
       this.elementos.set(indice, dato);
    }

     public void limpiar(T dato){
        for (int i = 0; i < elementos.size(); i++) {
            elementos.set(i, dato);
        }
    }

    @Override
    public String toString() {
        String estado = "";
        for (T dato : elementos) {
            if(dato != null)
            estado += dato.toString() +"\n";
        }
        return estado;
    }
}
