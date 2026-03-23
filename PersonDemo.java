class Person {
    int sid;
    String sname;
    String qual;
    static int count;

    personaldetails(int sid, String sname, String qual) {
        this.sid = sid;
        this.sname = sname;
        this.qual = qual;
        count++;
    }

    String display() {
        return sid + "  name: " + sname + "  qualification: " + qual + " | count: " + count;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();

        p.personaldetails(1, "shanmukh", "btech");
        p1.personaldetails(2, "anji", "btech");
        p2.personaldetails(3, "vijay", "btech");

        System.out.println("Personal Details: " + p.display());
        System.out.println("Personal Details: " + p1.display());
        System.out.println("Personal Details: " + p2.display());
    }
}