package HashTableFinalExam;

import java.util.Hashtable;

public class OrderList {
    //bảng băm
    private Hashtable<Customer, FruitList> mySales = new Hashtable<>();
    public OrderList(){
        Customer customer = new Customer(111, "Tran", "DN");
        FruitList fruitList = new FruitList();
        fruitList.putFruitToList("Pear");
        fruitList.putFruitToList("Mango");
        //System.out.println("" + customer);
        //fruitList.displayAll();
        mySales.put(customer, fruitList);
        Customer customer02 = new Customer(222, "Lien", "DN");
        FruitList fruitList02 = new FruitList();
        fruitList02.putFruitToList("Durian");
        fruitList02.putFruitToList("Orange");
        mySales.put(customer02, fruitList02);
    }
    public void putOrderList(Customer cus, FruitList fruit){
        mySales.put(cus, fruit);
        System.out.println("Already put the new order to the system");
    }
    public void displayOrderList(){
        for(Customer key : mySales.keySet()){
            FruitList value = mySales.get(key);
            System.out.println(key + " - Buy -" + value);
        }
    }

}
