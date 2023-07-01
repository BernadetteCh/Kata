package org.example.kyu7.kata1;
import java.util.function.Function;

public class Kata1 {
    //Represents a function that accepts one argument and produces a result.
    public boolean assertStudent(Student student, String name, String studentNumber) {
        Function<Student,Boolean> assertStudent = s->s.getName().equals(name) && s.getStudentNumber().equals(studentNumber) ? true : false;
        return assertStudent.apply(student);
    }
}
