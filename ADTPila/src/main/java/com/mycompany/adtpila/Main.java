package com.mycompany.adtpila;

public class Main {

    public static void main(String[] args) {
        Pila<String> p1 = new Pila<>();
        System.out.println(p1.isEmpty());
        System.out.println(p1.getLength());
        p1.push("Maria");
        p1.push("Jose");
        p1.peek();
        p1.pop();
        p1.toString();
    }
}
