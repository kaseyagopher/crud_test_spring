package com.example.crud_test.controller;

import com.example.crud_test.model.Produit;
import com.example.crud_test.service.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AppController {
    private ProduitService produitService;
    @GetMapping("hello")
    public String index() {
        return "welcome to the API";
    }

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.createProduit(produit);
    }

    public List<Produit> findAll(){
        return produitService.listProduits();
    }
}
