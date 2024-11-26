package com.library;

public class FabriqueProduit {
    public static final String cahier = "cahier";
    public static final String stylo = "stylo";
    public static final String sac = "sac";

    public Produit createProduit(String type) {
        Produit produit = null;
        switch (type) {
            case cahier:
                produit = new Cahier();
                break;
            case stylo:
                produit = new Stylo();
                break;
            case sac:
                produit = new Sac();
                break;
            default:
                System.err.println("type non repertorie");
        }
        
        return produit;
    }

}
