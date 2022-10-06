package com.mycompany.listasimplementeligada;

public class Main {

    public static void main(String[] args) {
        ListaLigada<Integer> head= new ListaLigada();
        System.out.println(head.estaVacio());
        System.out.println(head.getTamanio());
        head.agregarFinal(10);
        head.agregarFinal(50);
        head.agregarFinal(70);
        System.out.println(head.estaVacio());
        head.agregarInicio(30);
        head.agregarDespuesDe(10, 3);
        head.eliminar(2);
        head.eliminarElPrimero();
        head.elminartElFinal();;
        System.out.println(head.buscar(30));
        head.actualizar(70, 66);
        head.toString();
   }
    
}
