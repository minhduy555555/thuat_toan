package Ontap.Question7;

public class Main {
    public static void NhiPhan(int k) {
        MyStack s = new MyStack(20);
        System.out.print(k + " in binary system is: ");
        while (k > 0) {
            s.push(new Integer(k % 2));
            k = k / 2;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void BatPhan(int k) {
        MyStack s = new MyStack(20);
        System.out.print(k + " in octal system is: ");
        while (k > 0) {
            s.push(new Integer(k % 8));
            k = k / 8;
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }

    public static void main(String[] args) {
        NhiPhan(100);
        System.out.println();
        BatPhan(100);
    }

}
