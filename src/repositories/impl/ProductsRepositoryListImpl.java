package repositories.impl;

import models.Products;
import repositories.ProductsRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductsRepositoryListImpl implements ProductsRepository {

    private List<Products> productsList = new ArrayList<>();

    @Override
    public void save(Products products){
        this.productsList.add(products);
    }

    @Override
    public List<Products> findAll(){
        return productsList;
    }
}
