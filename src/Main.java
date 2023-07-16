import repositories.impl.ProductsRepositoryFileImpl;
import repositories.impl.ProductsRepositoryListImpl;
import services.ProductsService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductsRepositoryFileImpl productsRepositoryFile = new ProductsRepositoryFileImpl();
        ProductsRepositoryListImpl productsRepositoryList = new ProductsRepositoryListImpl();

        ProductsService productsService = new ProductsService(productsRepositoryFile);
        Scanner scanner = new Scanner(System.in);

       while(true) {
           System.out.println("1. add products");
           System.out.println("2. get all products");
           System.out.println("0. exit");

           int command = scanner.nextInt();
           scanner.nextLine();//sochranaem dannie is scannera

           switch (command) {
                case 1 -> {
                    String name = scanner.nextLine();
                    String quantity = scanner.nextLine();
                    String expired = scanner.nextLine();

                    productsService.signUp(name,quantity,expired);
                }
                case 2 -> System.out.println(productsService.getAllProducts());
                case 0 -> System.exit(0);
                }
           }


    }
}
//1. Нужно пересмотреть урок
//2. Сделать аналогичный проект, но с товарами (Products, Goods)
//    - Название
//    - Количество
//    - Вышел срок годности или нет (boolean)
//3. В личку скинуть ссылку на проект и скриншот браузера со списков товаров