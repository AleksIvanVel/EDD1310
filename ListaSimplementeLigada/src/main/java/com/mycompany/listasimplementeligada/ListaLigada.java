package com.mycompany.listasimplementeligada;

public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio;
    private T valor;
    private int referencia;
    
    public ListaLigada(){
       
    }

    public boolean estaVacio(){
        return this.head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public void agregarFinal(T dato){
        this.valor=dato;
        if(this.head==null){
            head= new Nodo(dato);
        }else{
            Nodo<T> nuevo= new Nodo(dato);
            Nodo<T> aux= this.head;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        System.out.println("Dato agregado al final");
    }

    public void agregarInicio(T dato){
        this.valor=dato;
        if(this.head==null){
            head= new Nodo(dato);
        }else{
            Nodo<T> nuevo= new Nodo(dato);
            nuevo.setSiguiente(head);
            head=nuevo;
        }
    }

    public void agregarDespuesDe(int referencia, T dato){
        this.referencia=referencia;
        this.valor= dato;
        for(int i=0; i<=referencia; i++){
            head.getSiguiente();
        }
        Nodo<T> nuevo= new Nodo(dato);
        head.setSiguiente(nuevo);
    }

    public void eliminar(int referencia){
        this.referencia=referencia;
         for(int i=0; i<=referencia; i++){
            head.getSiguiente();
        }
        head.setSiguiente(null);
    }

    public void eliminarElPrimero(){
        Nodo<T> aux=this.head;
        aux.getSiguiente();
        head=null;
        head=aux;
    }

    public void elminartElFinal(){
         Nodo<T> aux= this.head; 
        while(aux.getSiguiente()!=null){
           aux=aux.getSiguiente();
        }
        aux.setSiguiente(null);
    }

    public int buscar(T valor){
        int posicion=0;
        Nodo<T> aux= this.head;
        while(aux.getSiguiente()==valor){
            aux= (Nodo<T>) aux.getDato();
            posicion+=1;
        }
        aux.getDato();
        return posicion;
    }

    public void actualizar(T datoABuscar, T dato){
        int posicion;
        posicion = 0;
        Nodo<T> aux= this.head;
        while(aux.getDato()==valor){
            aux= (Nodo<T>) aux.getDato();
            posicion+=1;
        }
        aux.setDato(dato);
        this.head= aux;
    }

    public void tranversal(){
        Nodo<T> aux= head;
        while(aux!=null){
            System.out.println(aux);
            aux= aux.getSiguiente();
            
        }
    }
}
