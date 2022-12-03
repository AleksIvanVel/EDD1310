package com.mycompany.hashmap;
import java.util.HashMap;

public class MainHashMap {

    public static void main(String[] args) {
        HashMap hm1=new HashMap();
        
        hm1.put("nombre","Shelly"); //agrega un par de objetos llave-valor
        hm1.put("edad", 18);
        hm1.put("id", 1348976);
        hm1.put("lugar", "neza");
        
        System.out.println("El hashmap esta vacio: "+hm1.isEmpty());// verifica si la estructura esta vacia
        
        System.out.println(hm1.keySet());//retorna el conjunto de llaves que existen en el hashmap
        
        System.out.println(hm1.clone());//devuelve una copia del estado del hashmap, los pares llave-valor
        
        System.out.println(hm1.values());//retorna la coleccion de valores que estan en el hashmap
        
        System.out.println("tamaño del hashmap: " + hm1.size());//devuelve el tamaño del hashmap
        
        String valor = hm1.get("nombre").toString(); //devuelve el valor asociado a la clave
        System.out.println(valor);
        
        boolean contieneKey= hm1.containsKey("edad");// verifica si existe la llave indicada 
        System.out.println("La llave existe: " + contieneKey);// devuelve verdadero o falso 
        
        boolean contieneVal = hm1.containsValue("Ivan");//verifica si existe el valor indicado
        System.out.println("el valor existe: "+ contieneVal);// retorna veradero o falso
        
        hm1.remove("lugar");//ELimina el elemento asociado a la clave 
        System.out.println(hm1.containsValue("neza"));
        
        hm1.clear(); //elimina todos los elemntos del mapa 
        System.out.println(hm1.isEmpty());//verificamos si ahora esta vacia
        
    }
}
