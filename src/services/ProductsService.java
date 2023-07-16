package services;

import models.Products;
import repositories.ProductsRepository;
import java.util.List;

public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public void signUp(String name, String quantity, String expired){
        Products products = new Products( name, quantity, expired);
        productsRepository.save(products);//add product
    }

    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }
}
