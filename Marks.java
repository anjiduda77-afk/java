class Marks {
    int mark1 = 90;
    int mark2 = 85;
    int mark3 = 88;
}

class StudentTotal extends Marks {
    int total;

    void calculateTotal() {
        total = mark1 + mark2 + mark3;
        System.out.println("Student Details");
        System.out.println("Total Marks: " + total);
    }
}

class StudentAverage extends StudentTotal {
    float average;

    void calculateAverage() {
        average = total / 3.0f;
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentAverage obj = new StudentAverage();
        obj.calculateTotal();     // first calculate total
        obj.calculateAverage();   // then calculate average
    }
}
