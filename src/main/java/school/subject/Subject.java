package school.subject;

import school.grades.Grade;
import school.person.Teacher;

import java.util.Objects;

public class Subject {
    private final String description;
    private final Teacher teacher;
    private Grade grade;

    public Subject(String description, Teacher teacher, Grade grade) {
        this.description = description;
        this.teacher = teacher;
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(description, subject.description) &&
                Objects.equals(teacher, subject.teacher) &&
                Objects.equals(grade, subject.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, teacher, grade);
    }
}
