package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Student student=new Student(0,'F');
        int id=student.getStudentId();
        System.out.println("Student Id "+id);
        char type=student.getStudentype();
        System.out.println("student type "+type);
    }
}
