package repositories.impl;
import models.Products;
import repositories.ProductsRepository;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class ProductsRepositoryFileImpl implements ProductsRepository {
    private String fileName = "products.txt";

    @Override
    public void save(Products products){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) {
            writer.write("\n"+products.getName() + "#" + products.getQuantity() + "#" + products.isExpired());
        } catch (IOException e){
            throw new IllegalArgumentException("file problem");
        }
    }

    @Override
    public List<Products> findAll(){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split("#"))
                    .map(array -> new Products(array[0], array[1], array[2]))
                    .collect(Collectors.toList());//is file rasbil stroki i prewratil massiw strok w object
        } catch (IOException e){
            throw new IllegalArgumentException("file problem");
        }
    }
}
