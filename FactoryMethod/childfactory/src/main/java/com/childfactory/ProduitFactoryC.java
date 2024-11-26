package com.childfactory;

public abstract class ProduitFactoryC extends ProduitFactory {
    protected Produit createProduit() {
        Produit produit = null;
        produit = new ProduitC();
        return produit;
    };
}

