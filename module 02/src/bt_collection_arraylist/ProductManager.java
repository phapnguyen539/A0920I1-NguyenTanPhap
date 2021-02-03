package bt_collection_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ProductManager {
    public static List<Product> listProduct = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Nhập vào tên:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhâp vào id:");
        int id = scanner.nextInt();
        System.out.println("Nhập vào giá:");
        double price = scanner.nextDouble();
        Product product = new Product(name, id, price);
        listProduct.add(product);
    }

    public void editProduct() {
        System.out.println("Nhập vào id muốn sửa :");
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                System.out.println("Nhập vào tên muốn sửa :");
                String name = scanner.nextLine();
                listProduct.get(i).setName(name);
            }
        }
    }

    public void deleteProduct() {
        System.out.println("Nhập vào Id muốn xóa:");
        int id = scanner.nextInt();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                System.out.println("Nhập vào tên muốn xóa");
                String name = scanner.nextLine();
                listProduct.remove(name);
            }
        }
    }

    public void showProduct() {
        if (listProduct.size() == 0) {
            System.out.println("Ko có sản phẩm ai đây:");
        } else {
            for (Product product : listProduct) {
                System.out.println(product);
            }
        }
    }
    public void searchProduct(){
        System.out.println("Nhập vào vị tri muốn tìm:");
        int id= scanner.nextInt();
        for(int i=0; i<listProduct.size();i++){
            if (id== listProduct.get(i).getId()){
                System.out.println(listProduct.get(i).getId());

            }
        }
    }
    public void sortProduct(){
        Collections.sort(listProduct);
        System.out.println("---------");
        for(Product product: listProduct){
            System.out.println(product);
        }

    }
    public void menuProduct(){
        System.out.println("1.AddProduct. \n"+
                "2.EditProduct. \n"+
                "3.DeleteProduct. \n"+
               "4.ShowProduct. \n"+
                "5.SearchProduct.\n"+
                "6.SortProduct.");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                addProduct();
                menuProduct();
                break;
            case 2:
                editProduct();
                menuProduct();
                break;
            case 3:
                deleteProduct();
                menuProduct();
                break;
            case 4:
                showProduct();
                menuProduct();
                break;
            case 5:
                searchProduct();
                menuProduct();
                break;
            case 6:
                sortProduct();
                menuProduct();
                break;
            default:
                System.out.println("Xin chọn nhập từ 1 đến 6.");
        }
    }

}
