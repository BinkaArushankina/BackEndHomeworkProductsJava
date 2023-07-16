package repositories;

import models.Products;

import java.util.List;

public interface ProductsRepository {
    void save (Products products);

    List<Products> findAll();
}
