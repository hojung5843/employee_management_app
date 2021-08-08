package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents ();
}
