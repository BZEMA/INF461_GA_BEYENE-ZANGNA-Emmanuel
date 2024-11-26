package com.factory;

public class Client {
    public static void main(String[] args) {
        System.out.println("Bonjour tout le monde");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit = null;

        // pour creer un produit de type A
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeA);
        produit.methodeproduit();
        
        // pour creer un produit de type B
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeB);
        produit.methodeproduit();
        
        // pour creer un produit de type C
        produit = fabriqueProduit.createProduit(FabriqueProduit.typeC);
        produit.methodeproduit();
        
        // pour creer un produit inexistant
        String d = "D";
        produit = fabriqueProduit.createProduit(d);
        produit.methodeproduit();
    }
}