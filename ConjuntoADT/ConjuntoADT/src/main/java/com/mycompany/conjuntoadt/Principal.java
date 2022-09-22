package com.mycompany.conjuntoadt;

public class Principal {

    public static void main(String[] args) {
        ConjuntoADT<Integer> c = new ConjuntoADT(2);
        ConjuntoADT<Integer> c2 = new ConjuntoADT(2);
        System.out.println("Tamaño del conjunto: " + c.getlongitud() + " elementos");
        System.out.println(c.contiene(null));
        c.agregar(12);
        c.agregar(15);
        c.eliminar(12);
        System.out.println(c.contiene(12));
        System.out.println(c.contiene(15));
        c2.agregar(32);
        c.equals(c2);
        c.esSubConjunto(c2);
        c.union(c2);
        c.interseccion(c2);
        c.diferencia(c2);
        c.iterador();
    }
    
}
