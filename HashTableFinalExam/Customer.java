package HashTableFinalExam;

public class Customer {
    private int id;
    private String name;
    private String address;

    public Customer(){
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public Customer enterCustomer(){
        Customer cusTmp = new Customer();
        System.out.print("Enter id: ");
        int i = Main.input.nextInt();
        System.out.print("Enter name: ");
        String n = Main.input.nextLine();
        System.out.print("Enter address: ");
        String a = Main.input.nextLine();
        cusTmp = new Customer(i, n, a);
        return cusTmp;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
