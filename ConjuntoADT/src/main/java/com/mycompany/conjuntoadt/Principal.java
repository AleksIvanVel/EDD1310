package com.mycompany.conjuntoadt;

public class Principal {

    public static void main(String[] args) {
        ConjuntoADT c = new ConjuntoADT(2);
        System.out.println("Tamaño del conjunto: " + c.getlongitud() + "elementos");
        System.out.println(c.contiene(null));
        c.agregar(12);
        c.eliminar(12);
    }
    
}
