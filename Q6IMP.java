
import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q6IMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        ArrayList<Student> studentList = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            studentList.add(new Student(name, marks));
        }
        sc.close();

        // Sorting
        Collections.sort(studentList, (a, b) -> {
            if (b.marks != a.marks) {
                return b.marks - a.marks;
            } else {
                return a.name.compareTo(b.name);

            }
        });

        for (Student s : studentList) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}