package school;

import school.person.Student;
import school.person.Teacher;

import java.util.List;
import java.util.Objects;

public class Clazz {
    private String description;
    private List<Student> students;
    private Teacher primaryTeacher;

    public Clazz(String description, List<Student> students, Teacher primaryTeacher) {
        this.description = description;
        this.students = students;
        this.primaryTeacher = primaryTeacher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getPrimaryTeacher() {
        return primaryTeacher;
    }

    public void setPrimaryTeacher(Teacher primaryTeacher) {
        this.primaryTeacher = primaryTeacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Objects.equals(description, clazz.description) &&
                Objects.equals(students, clazz.students) &&
                Objects.equals(primaryTeacher, clazz.primaryTeacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, students, primaryTeacher);
    }
}
