import models.Products;
import repositories.impl.ProductsRepositoryFileImpl;

public class Main2 {
    public static void main(String[] args) {
        ProductsRepositoryFileImpl productsRepositoryFile = new ProductsRepositoryFileImpl();
        Products products = new Products("Bread","5","true");
        productsRepositoryFile.save(products);

    }
}
