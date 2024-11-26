package com.factory;

public class ProduitB extends Produit {
    
    public ProduitB(){
    }

    @Override
    public void methodeproduit() {
        System.out.println("Je suis un produit de type B");
        System.out.println("produitB.methodeproduit()");
    };
    
    
}
