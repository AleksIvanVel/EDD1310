package com.mycompany.treemap;
import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {

    public static void main(String[] args) {
        Map<Integer, String> tmp1 = new TreeMap<Integer, String>();
        
        tmp1.put(1, "aleks"); //Agrega un elemento al treemap
        tmp1.put(6, "aura");
        tmp1.put(4, "dann");
        tmp1.put(2, "salma");
        tmp1.put(5, "rich");
        tmp1.put(3, "edgar");
        
        System.out.println(tmp1);//muestra la coleccion de pares llave-valor, ya ordenados 
        System.out.println(tmp1.entrySet());
        
        
        System.out.println("tamaño del treemap: "+tmp1.size());//retorna el tamaño de la estructura
        
        System.out.println("valores: "+ tmp1.values());//retorna los valores contenidos en la estructura
        
        System.out.println(tmp1.keySet());//regresa las claves contenidas y ordenadas 
        
        System.out.println("Contiene el valor? "+tmp1.containsValue("rich"));//verifica si hay alguna llave con el valor indicado
        //retorna falso o veradero
        
        System.out.println("Contiene la clave? "+tmp1.containsKey(7));//vrifica si hay algun valor asociado a la clave indicada
        //regresa veradero o falso
        
        System.out.println("El valor asicoado a la clave es: "+tmp1.get(3));//retorna el valor asociado a la clave
        
        System.out.println("Codigo del treeMap: "+tmp1.hashCode());//retorna el codigo del treemap
        //se obtiene al hacer la suma de los codigos asociados a las entradas      
    }
}
