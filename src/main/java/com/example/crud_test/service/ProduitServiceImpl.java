package com.example.crud_test.service;

import com.example.crud_test.model.Produit;
import com.example.crud_test.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {
    private ProduitRepository produitRepository;

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> listProduits() {
        return produitRepository.findAll();
    }



    @Override
    public Produit updateProduit(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p->{
                    p.setNom(produit.getNom());
                    p.setPrix(produit.getPrix());
                    p.setDescription(produit.getDescription());

                    return produitRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("product not found"));
    }

    @Override
    public String delete(Long id) {
        produitRepository.deleteById(id);
        return "Produit deleted";
    }
}
