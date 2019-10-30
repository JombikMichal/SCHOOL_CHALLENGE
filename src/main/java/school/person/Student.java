package school.person;

import school.subject.Subject;

import java.util.List;
import java.util.Objects;

public class Student {
    private final String firstName;
    private final String sureName;
    private List<Subject> subjects;

    public Student(String firstName, String sureName, List<Subject> subjects) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(sureName, student.sureName) &&
                Objects.equals(subjects, student.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, sureName, subjects);
    }
}
