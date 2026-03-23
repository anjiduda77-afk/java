import java.io.*;

class EvenOddFile {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};

        try {
            FileWriter even = new FileWriter("Even.txt");
            FileWriter odd = new FileWriter("Odd.txt");

            for (int n : num) {
                if (n % 2 == 0) {
                    even.write(n + "\n");
                } else {
                    odd.write(n + "\n");
                }
            }

            even.close();
            odd.close();
            System.out.println("Numbers written successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}