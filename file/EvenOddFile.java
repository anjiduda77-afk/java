import java.io.*;

public class EvenOddFile {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 33, 40};

        try {
            FileWriter evenFile = new FileWriter("Even.txt");
            FileWriter oddFile = new FileWriter("Odd.txt");

            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenFile.write(num + System.lineSeparator());
                } else {
                    oddFile.write(num + System.lineSeparator());
                }
            }

            evenFile.flush();
            oddFile.flush();

            evenFile.close();
            oddFile.close();

            System.out.println("Files created successfully ✅");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}