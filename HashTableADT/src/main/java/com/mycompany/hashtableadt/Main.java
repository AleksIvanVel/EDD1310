package com.mycompany.hashtableadt;

public class Main {

    public static void main(String[] args) {
        HashTableADT<String> ht1=new HashTableADT(5);
        ht1.add(1, "Shelly");
        ht1.add(2, "18");
//        ht1.add("residencia", "CD.Neza");
//        ht1.add("numero", "5578283945");
        System.out.println(ht1.valueOf("nombre"));
        ht1.remove("edad");
        
    }
}
