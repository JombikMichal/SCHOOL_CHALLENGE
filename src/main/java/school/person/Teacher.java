package school.person;

import java.util.Objects;

public class Teacher {
    private final String firstName;
    private final String sureName;

    public Teacher(String firstName, String sureName) {
        this.firstName = firstName;
        this.sureName = sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSureName() {
        return sureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(firstName, teacher.firstName) &&
                Objects.equals(sureName, teacher.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, sureName);
    }
}
