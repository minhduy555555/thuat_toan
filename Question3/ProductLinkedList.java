package Ontap.Question3;

import java.util.ArrayList;
import java.util.List;

public class ProductLinkedList {
    //Đầu tiên là khai báo cái đầu
    private ProductNode head = null;
    private int size = 0;

    public ProductLinkedList() {
    }

    //Viết hàm thêm phần tử Node vào đầu
    public void addFirst(Product product) {
        ProductNode newNode = new ProductNode(product);
        newNode.setNext(head);
        head = newNode;
        size++; //Tăng kích cỡ
    }

    // Viết hàm xóa từ Front
    public ProductNode removeFromFront() {
        //Xét list có rỗng không
        if (isEmpty()) {
            return null;
        }
        ProductNode removedNode = head;
        head = head.getNext();
        size--; // Giảm kích cỡ
        removedNode.setNext(null);
        return removedNode;
    }
    // Viết hàm hiển thị danh sách mặt hàng ở câu a
    public void printList(){
        ProductNode current = head;
        System.out.print("Head ->");
        while (current != null){
            System.out.println("" + current.getProduct());
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
    //Viết hàm trả về số lượng các phần tử đang có trong danh sách câu a

    public int numberOfProducts(){
        return size;
    }
    // Viết hàm tìm kiếm Product dựa trên tên nhập vào
    // Trả về là danh sách các Product nên mình sẽ khai báo kiểu trả về là Arraylist
    public List<Product> searchByName(String nameSearch){
        List<Product> listOfProducts = new ArrayList<>();
        // Duyệt các phần tử trong linked list để tìm kiếm
        ProductNode current = head;
        Product product = new Product();
        //Duyệt thì giống như in do, dùng while
        while(current != null){
            //Ứng với mỗi phần tử mình sẽ so sánh tên -> searchByName
            //Nếu searchByXXX thì sẽ so sánh searchXXX(XXX Data, type XXX); tùy yêu cầu cho
            //Không phải lúc nào cũng so sánh
            //Lấy product tại vị trí node current
            product = current.getProduct();
            if (product.getName().contains(nameSearch)){
                listOfProducts.add(product);
            }
            current = current.getNext();
        }
        return listOfProducts;
    }
    //Viết hàm sx các phần tử theo thứ từ giảm đến tăng
    //Nếu sx theo XXX thì làm tương tự ở trên, tìm kiếm by XXX
    public void bubbleSortByPrice(){
        // Chot các vị trí node head và index
        ProductNode current = head, index = null;
        Product currentProduct, indexProduct;
        if (head == null){
            return;
        } else {
            //Duyệt để sx
            while (current != null){
                index = current.getNext();
                //Lấy phần tử bên cạnh current (do sx theo bubble)
                while (index != null){
                    if (current.getProduct().getPrice()> index.getProduct().getPrice()){
                        //Nếu v thì mình swap data
                        // Hay nói cách khác là swap Product của 2 node
                        //Cho không swap 2 node, vì han se dut linkedlist
                        currentProduct = current.getProduct();
                        indexProduct = index.getProduct();
                        //swap
                        current.setProduct(indexProduct);
                        index.setProduct(currentProduct);
                    }
                    index = index.getNext();
                }
                current = current.getNext(); //duyệt từng phần tử
            }
        }
        System.out.println("Bubble Sorted");
        printList();
    }
    public ProductNode getHead() {
        return head;
    }

    public void setHead(ProductNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
