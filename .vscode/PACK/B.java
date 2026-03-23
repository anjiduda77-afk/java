package mypack;

public class B {
    public static void main(String[] args) {

        A obj = new A();

        // Accessing protected members
        System.out.println("Accessing from another class in same package:");
        System.out.println("Number: " + obj.num);
        obj.display();
    }
}