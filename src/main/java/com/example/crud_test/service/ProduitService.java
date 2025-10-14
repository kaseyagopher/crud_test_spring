package com.example.crud_test.service;

import com.example.crud_test.model.Produit;

import java.util.List;

public interface ProduitService {
    Produit createProduit(Produit produit);

    List<Produit> listProduits();

    Produit updateProdui(Long id, Produit produit);

    String delete(Long id);
}

