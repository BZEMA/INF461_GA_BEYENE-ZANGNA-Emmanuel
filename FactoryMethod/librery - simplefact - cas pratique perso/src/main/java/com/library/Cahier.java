package com.library;

public class Cahier extends Produit {
    
    public Cahier(){
    }

    @Override
    public void description() {
        System.out.println("Tu veux un cahier pour prendre des notes");
        System.out.println("Cahier.forniture()");
    };
    
    
}
