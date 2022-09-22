package com.mycompany.conjuntoadt;
import java.util.ArrayList;

public class ConjuntoADT<T>{
    ArrayList <T> conjunto;
    ArrayList <T> otroConjunto;
    ArrayList <T> nuevoConjunto;
    int tamanioConjunto;
    T elemento;
    boolean contiene;


    public ConjuntoADT (int tamanioConjunto){
        this.tamanioConjunto= tamanioConjunto;
        conjunto= new ArrayList (tamanioConjunto);
        System.out.println("Conjunto creado");
    }

    public int getlongitud(){
      return this.tamanioConjunto;
    }
  
    public boolean contiene(T elemento){
      this.elemento= elemento;
      if (conjunto.contains(elemento)){
          contiene= true; 
      } else {
          contiene= false;
        }
        return contiene;
    }

    public void agregar(T elemento){
        this.elemento = elemento;
        if(!conjunto.contains(elemento)){
            conjunto.add(elemento);
        }  
        System.out.println("Elemento agregado");
    }

    public void eliminar(T elemento){
        this.elemento=elemento;
        if(this.conjunto.contains(elemento)){
           this.conjunto.remove(elemento);
        }else{
            System.out.println("El elemento que desa eliminar no existe en el conjunto");
        }
        System.out.println("Elemento eliminado");
    }


    public boolean equals(ArrayList otroConjunto){
      this.otroConjunto= otroConjunto;
      for(int i=0; i<tamanioConjunto; i++){
            if(conjunto.get(i).equals(this.otroConjunto.get(i))){
               contiene=true;                
            }else{
                contiene= false;
            }
      }
        return contiene;
    }

    public boolean esSubConjunto(ArrayList otroConjunto){
        this.otroConjunto = otroConjunto;
        for (int i=0; i<tamanioConjunto; i++){
            if(conjunto.get(i).equals(this.otroConjunto.get(i))){
                contiene = true;
            }else{
               contiene = false;
            }
        }
       
        return contiene;
    }

    public ArrayList union(ArrayList otroConjunto){
        this.otroConjunto = otroConjunto;
        for(int i=0; i<tamanioConjunto; i++){
            if(!conjunto.get(i).equals(this.otroConjunto.get(i))){
                nuevoConjunto.add(i, conjunto.get(i));
                nuevoConjunto.add(i+1, (T) otroConjunto.get(i));
            }
        } 
    return nuevoConjunto;
    }

  public ArrayList interseccion(ArrayList otroConjunto){
        this.otroConjunto = otroConjunto;
        for(int i=0; i<tamanioConjunto; i++){
            if(conjunto.get(i).equals(this.otroConjunto.get(i))){
                nuevoConjunto.add(i, conjunto.get(i));
                nuevoConjunto.add(i+1, (T) otroConjunto.get(i));
            }else{
                nuevoConjunto.add(i, null);
            }
        } 
    return nuevoConjunto;
    }

    public ArrayList diferencia(ArrayList otroConjunto){
        this.otroConjunto = otroConjunto;
        for(int i=0; i<tamanioConjunto; i++){
            if(!conjunto.get(i).equals(this.otroConjunto.get(i))){
                nuevoConjunto.add(i, conjunto.get(i));
            }else{
                nuevoConjunto.add(i, null);
            }
        } 
    return nuevoConjunto;
    }

    public void iterador(){
       conjunto.iterator();
    }
}
