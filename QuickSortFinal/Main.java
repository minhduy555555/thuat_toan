package QuickSortFinal;

public class Main {
    public static void printArray(Fruit arr[]){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i] + "");
        }
    }
    public static void quickSortByCode(Fruit arr[], int left, int right){
        if(left >= right){
            return;
        } else {
            int index = partitionByCode(arr, left, right);
            if (left < index -1){
                quickSortByCode(arr, left, index -1);
            }
            if (index < right){
                quickSortByCode(arr, index, right);
            }
        }
    }
    public static void quickSortByPrice(Fruit arr[], int left, int right){
        if(left >= right){
            return;
        } else {
            int index = partitionByPrice(arr, left, right);
            if (left < index -1){
                quickSortByPrice(arr, left, index -1);
            }
            if (index < right){
                quickSortByPrice(arr, index, right);
            }
        }
    }
    public static void quickSortByName(Fruit arr[], int left, int right){
        if(left >= right){
            return;
        } else {
            int index = partitionByName(arr, left, right);
            if (left < index -1){
                quickSortByName(arr, left, index -1);
            }
            if (index < right){
                quickSortByName(arr, index, right);
            }
        }
    }
    public static int partitionByName(Fruit arr[], int left, int right){
        int i = left, j = right;
        Fruit pivot = arr[(left + right) / 2];
        while (i <= j){
            while (arr[i].getName().compareTo(pivot.getName()) < 0 ){
                i ++;
            }
            while (arr[j].getName().compareTo(pivot.getName())>0){
                j --;
            }
            if (i <= j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return i;
    }
    public static int partitionByPrice(Fruit arr[], int left, int right){
        int i = left, j = right;
        Fruit pivot = arr[(left + right) / 2];
        while (i <= j){
            while (arr[i].getPrice() < pivot.getPrice()){
                i ++;
            }
            while (arr[j].getPrice() > pivot.getPrice()){
                j --;
            }
            if (i <= j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return i;
    }
    public static int partitionByCode(Fruit arr[], int left, int right){
        int i = left, j = right;
        Fruit pivot = arr[(left + right) / 2];
        while (i <= j){
            while (arr[i].getCode() < pivot.getCode()){
                i ++;
            }
            while (arr[j].getCode() > pivot.getCode()){
                j --;
            }
            if (i <= j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return i;
    }
    public static void swap(Fruit[] array, int i, int j){
        if ( i == j){
            return;
        }
        Fruit temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args ){
        Fruit[] myFruits = new Fruit[5];
        myFruits[0] = new Fruit(111,"Apple","DaLat",10);
        myFruits[1] = new Fruit(222,"Orange","Hue",9);
        myFruits[2] = new Fruit(333,"Lemon","LamDong",8);
        myFruits[3] = new Fruit(444,"Banana","HaNoi",6);
        myFruits[4] = new Fruit(555,"Peach","DaNang",15);
        printArray(myFruits);
        quickSortByCode(myFruits, 0, myFruits.length - 1);
        System.out.println("By Code ------------");
        printArray(myFruits);

        quickSortByPrice(myFruits, 0, myFruits.length - 1);
        System.out.println("By Price ------------");
        printArray(myFruits);

        quickSortByName(myFruits, 0, myFruits.length - 1);
        System.out.println("By Name ------------");
        printArray(myFruits);
    }
}
