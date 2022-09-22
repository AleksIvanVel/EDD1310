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
        for (int i=0; i<tamanioConjunto; i++){
            conjunto.add(i, null);
        }
        System.out.println("Conjunto creado");
    }

    public int getlongitud(){
      return this.tamanioConjunto;
    }
  
    public boolean contiene(T elemento){
      this.elemento= elemento;
      contiene = conjunto.contains(this.elemento);
        return contiene;
    }

    public void agregar(T elemento){
        this.elemento = elemento;
        contiene = conjunto.contains(this.elemento);
        if(contiene != true){
            conjunto.add(elemento);
        }
        System.out.println("Elemento agregado: " + elemento);
    }

    public void eliminar(T elemento){
        this.elemento = elemento;
        contiene= conjunto.contains(this.elemento);
        if(contiene == true){
           conjunto.remove(elemento);
        }else{
            System.out.println("El elemento que desa eliminar no existe en el conjunto");
        }
        System.out.println("Elemento eliminado");
    }


    public String equals(ArrayList <T> conjunto){
        this.otroConjunto = conjunto;
        String estado = null;
        for(int i=0; i<tamanioConjunto; i++){
               contiene= conjunto.get(i).equals(this.otroConjunto.get(i));               
               if(contiene == true){
                    estado = "Elemento" + i + " del conjunto 1 es igual al elemento "+ i + " del conjunto 2";
                } else{
                    estado = "Elemento" + i + " del conjunto 1 es diferente al elemento "+ i + " del conjunto 2";
                }      
      }
        return estado;
    }

    public boolean esSubConjunto(ArrayList <T> conjunto){
        this.otroConjunto = conjunto;
        for (int i=0; i<tamanioConjunto; i++){
            if(conjunto.get(i).equals(this.otroConjunto.get(i))){
                contiene = true;
            }else{
               contiene = false;
            }
        }
       
        return contiene;
    }

    public ArrayList union(ArrayList <T> conjunto){
        this.otroConjunto = conjunto;
        for(int i=0; i<tamanioConjunto; i++){
            if(!conjunto.get(i).equals(this.otroConjunto.get(i))){
                nuevoConjunto.add(i, conjunto.get(i));
                nuevoConjunto.add(i+1, (T) otroConjunto.get(i));
            }
        } 
    return nuevoConjunto;
    }

  public ArrayList interseccion(ArrayList <T> conjunto){
        this.otroConjunto = conjunto;
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

    public ArrayList diferencia(ArrayList <T> conjunto){
        this.otroConjunto = conjunto;
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
