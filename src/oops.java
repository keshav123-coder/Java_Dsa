public class oops {

    static class Student {

        Student() {
            System.out.println("Student default constructor called");
        }

        Student(int id) {
            System.out.println("Student ID: " + id);
        }

        Student(String name) {
            System.out.println("Student Name: " + name);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student("Keshav");
    }
}