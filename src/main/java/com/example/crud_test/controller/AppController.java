package com.example.crud_test.controller;

import com.example.crud_test.model.Produit;
import com.example.crud_test.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AppController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("hello")
    public String index() {
        return "welcome to the API";
    }

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

    @GetMapping("/show")
    public List<Produit> findAll(){
        return produitService.listProduits();
    }

    @PutMapping("/update/{id}")
    public Produit updateProduit(@PathVariable Long id,@RequestBody Produit produit){
        return produitService.updateProduit(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduit(@PathVariable Long id){
        return produitService.delete(id);
    }
}
