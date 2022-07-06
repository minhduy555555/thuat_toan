package HashTableFinalExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        OrderList listOfSaleToday = new OrderList();
        listOfSaleToday.displayOrderList();
        Customer c = new Customer();
        c = c.enterCustomer();
        FruitList f = new FruitList();
        ArrayList<String> myFruits = f.enterAllFruits(2);
        OrderList ol = new OrderList();
        ol.putOrderList(c, f);
        ol.displayOrderList();
    }
}


