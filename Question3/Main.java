package Ontap.Question3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Product p01 = new Product("Book Java", 39.9 ,10);
        Product p02 = new Product("Book C#", 12.3, 5);
        Product p03 = new Product("Book PhP", 9,2);
        Product p04 = new Product("Advanced Book", 49.9,10);
        ProductLinkedList list = new ProductLinkedList();
        System.out.println(" " + list.isEmpty());
        list.addFirst(p01);
        list.addFirst(p02);
        list.addFirst(p03);
        list.addFirst(p04);
        System.out.println("" + list.numberOfProducts());
        list.printList();
        // Viết hàm tìm kiếm
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts = list.searchByName("Java");
        System.out.println("" + listOfProducts);
        //list.removeFromFront(); có thể xóa nếu muốn
        //Viết hàm sắp xếp theo
        System.out.println("---------");
        list.bubbleSortByPrice();
    }
}
