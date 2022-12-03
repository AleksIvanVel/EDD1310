package com.mycompany.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapMain {

    public static void main(String[] args) {
       
        LinkedHashMap<Integer, String> lhm1= new LinkedHashMap<Integer, String>();
        
        lhm1.put(1, "mascotas");//agrega elementos a la estructura sin orednarlos
        lhm1.put(3, "hachi");
        lhm1.put(2, "lucrecia");
        lhm1.put(4, "tita");
        lhm1.put(5, "sofia");
        
        System.out.println(lhm1.clone());//regresa una copia del estado actual de la estructura 
        System.out.println(lhm1);
        
        
        System.out.println("La llave existe: "+lhm1.containsKey(3));//verifica si hay algun valor asociado la clave indicada
        //retorna true o false
        
        System.out.println("El valor existe: "+lhm1.containsValue("rocky"));//verifica si el valor indicado esta asociado alguna llave
        //retorna true o false 
        
        System.out.println(lhm1.get(4));//regresa el valor asociado a la llave indicada
        
        System.out.println(lhm1.getOrDefault(6, "nombreDeMascotas"));//retorna el valor asociado a la llave indicada
        //de no tenerlo, le asiga uno por defaul que tambien se debe indicar 
        
        System.out.println("La estructura esta vacia: "+lhm1.isEmpty());//verifica si la estructura esta vacia 
        //retorna true o false 
        
        System.out.println(lhm1.keySet());//retorna las llaves contenidas en la estructura
        
        //lhm1.computeIfAbsent(2, mappingFunction));//metodo que remapea la llave con la operacion indicada 
        
        System.out.println("tamaño de la estructura: "+lhm1.size());//retorna el tamaño de la estructura
        
        lhm1.putIfAbsent(6, "rocky");//agrega el para llave-valor, si la llave ya existe, no realiza tal operacion
        System.out.println(lhm1);
        
        lhm1.remove(1);//elmina el valor asociado a la clave indicada
        
        lhm1.remove(1, "hachi"); //elimina el par llave-valor indicado
        
        lhm1.replace(2, "hachi");//reemplaza el elmento asociado a la llave indicada por el objeto indicado 
        
        System.out.println(lhm1);
    }
}
