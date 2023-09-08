package SeminarsOOP.Mvcstudentapp.Model;

import SeminarsOOP.Mvcstudentapp.Model.Core.Student;

import java.util.List;

public class ModelClassList {
    private List<Student> students;

    public ModelClassList(List<Student> students){
        this.students = students;

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
