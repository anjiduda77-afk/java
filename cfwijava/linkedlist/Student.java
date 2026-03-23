package cfwijava.linkedlist;

public class Student implements Comparable<Student> {
    int sid;
    String sname;
    int smarks;

    Student(int sid, String sname, int smarks){
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    @Override
    public int compareTo(Student o) {
        return this.smarks - o.smarks;
    }
}