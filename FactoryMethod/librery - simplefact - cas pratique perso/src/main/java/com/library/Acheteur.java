package com.library;

public class Acheteur {
    public static void main(String[] args) {
        System.out.println("Bonjour tout le monde, vous allez prendre des founitures scolaires");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit = null;

        // pour creer un produit de type A
        produit = fabriqueProduit.createProduit(FabriqueProduit.cahier);
        produit.description();
        
        // pour creer un produit de type B
        produit = fabriqueProduit.createProduit(FabriqueProduit.stylo);
        produit.description();
        
        // pour creer un produit de type C
        produit = fabriqueProduit.createProduit(FabriqueProduit.sac);
        produit.description();
        
        // pour creer un produit inexistant
        String d = "D";
        produit = fabriqueProduit.createProduit(d);
        produit.description();
    }
}