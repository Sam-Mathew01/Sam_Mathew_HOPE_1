package service;

import model.Student;
import parser.XMLParser;

import java.util.List;

public class StudentService {

    private List<Student> students;

    public StudentService(String filePath) {
        students = XMLParser.parseXML(filePath);
    }

    public void displayAll() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}