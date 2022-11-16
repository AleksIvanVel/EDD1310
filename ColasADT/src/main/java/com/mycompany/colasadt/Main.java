package com.mycompany.colasadt;

public class Main {

    public static void main(String[] args) {
        ColaADT<String> c1=new ColaADT();
        System.out.println(c1.isEmpty());
        c1.enqueue("Aleks");
        c1.enqueue("Ivan");
        c1.enqueue("Shelly");
        System.out.println(c1.toString());
        c1.dequeue(); //se elimina "Aleks"
        System.out.println(c1.toString());
    }
}
