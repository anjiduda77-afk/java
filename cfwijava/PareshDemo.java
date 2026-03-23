import java.util.ArrayList;

class PareshDemo {
    int id;
    String name;
    int marks;

    PareshDemo(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }

    public static void main(String[] args) {
        ArrayList<PareshDemo> list = new ArrayList<>();
        list.add(new PareshDemo(1, "Paresh", 93));
        list.add(new PareshDemo(2, "Java", 85));
        list.add(new PareshDemo(3, "Collection Framework", 90));

        System.out.println("Elements in the list:");
        for (PareshDemo demo : list) {
            System.out.println(demo);
        }
    }
}