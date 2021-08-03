package academy.learnprogramming;

public class Student {
    private int studentId;
    private char studentype;


    public Student(int studentId, char studentype) {
        this.studentId = studentId;
        this.studentype = studentype;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentype() {
        return studentype;
    }
}
