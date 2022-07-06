package HashTableFinalExam;

import java.util.ArrayList;

public class FruitList {
    private ArrayList<String> myFruits = new ArrayList<>();

    public FruitList(){
        myFruits.add("Apple");
    }
    public void putFruitToList(String fruitName){
        myFruits.add(fruitName);
    }
    public ArrayList<String> enterAllFruits(int numberOfFruits){
        String nameTmp;
        for (int i = 0; i < numberOfFruits; i++){
            System.out.print("Enter the fruit name: ");
            nameTmp = Main.input.nextLine();
            myFruits.add(nameTmp);
        }
        return myFruits;
    }

    public ArrayList<String> getMyFruits() {
        return myFruits;
    }

    public void setMyFruits(ArrayList<String> myFruits) {
        this.myFruits = myFruits;
    }
    public void displayAll(){
        for (String myFruit: myFruits){
            System.out.println("" + myFruit);
        }
    }

    @Override
    public String toString() {
        return "FruitList{" +
                "myFruits=" + myFruits +
                '}';
    }
}
